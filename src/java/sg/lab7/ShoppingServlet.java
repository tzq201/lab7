package sg.lab7;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;


@WebServlet("/search")
public class ShoppingServlet extends HttpServlet
{
    @Resource(name="jdbc/jedproject")
    private DataSource dsProductCatalouge;
    
    @EJB
    private ShoppingBean shoppingBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String searchTerm = request.getParameter("searchterm");
        
        List<ItemRecord> searchResult = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultset = null;
        
         try {
            connection = dsProductCatalouge.getConnection();
		
            preparedStatement = connection.prepareStatement("SELECT * FROM item WHERE itemDescription LIKE ?");

            preparedStatement.setString(1, "%" + searchTerm + "%");
         
            resultset = preparedStatement.executeQuery();

            while(resultset.next()) {
                ItemRecord itemlist = new ItemRecord();
                
                itemlist.setItemID(resultset.getString("itemId"));
                itemlist.setItemDescription(resultset.getString("itemDescription"));
                itemlist.setBrand(resultset.getString("brand"));
                itemlist.setPrice(resultset.getDouble("price"));
                itemlist.setPoints(resultset.getInt("points"));
                
                searchResult.add(itemlist);
            }
        } catch(SQLException ex) {
            Logger.getLogger(ShoppingServlet.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        } finally {
            if(resultset != null) {
                try {
                    resultset.close();
                } catch(SQLException ex) {
                    Logger.getLogger(ShoppingServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch(SQLException ex) {
                    Logger.getLogger(ShoppingServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch(SQLException ex) {
                    Logger.getLogger(ShoppingServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
        HttpSession session = request.getSession();
        session.setAttribute("searchterm", searchTerm);
        session.setAttribute("searchresult", (Object) searchResult); 
        
        response.sendRedirect(this.getServletContext().getContextPath() + "/searchResults.jsp");
    }
}
