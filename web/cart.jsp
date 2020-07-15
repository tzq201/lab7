<%-- 
    Document   : cart
    Created on : 3 Jul, 2020, 8:38:36 PM
    Author     : tzq20
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
    </head>
    <body>
        <h1>View Cart</h1>
        <hr/>
        <p>
            <!--Results-->
            <table>
                <tr><th>Item</th><th>Description</th><th>Price</th><th>Points you will earn</th><th>Quantity</th>
                </tr>
                <%
                    //List<Cart> cartResult = (List<Cart>) session.getAttribute("Cart");
                    //if(cartResult == null || cartResult.size() <= 0) {
                %>
            <tr><td colspan="5">(No result is found)</td></tr>
                <%
                    //} else {
                    //    for(Cart cart : cartResult) {
                %>
                <tr>
                    <td><%=//cart.getItemID() %></td>
                    <td><%=//cart.getDescription() %></td>
                    <td><%=//cart.getPrice()%></td>
                    <td><%=//cart.getPoints() %></td>
                    <td><%=//cart.getQty() %></td>
                    <td>
                        <form action="DeleteCart" method="post">
                            <input type="hidden" name="ItemID" value="<%=//cart.getItemID() %>"/>
                            <input type="hidden" name="descr" value="<%=//cart.getDescription()%>"/>
                            <input type="hidden" name="points" value="<%=//cart.getPoints()%>"/>
                            <input type="hidden" name="price" value="<%=//cart.getPrice() %>"/>
                           <input type="submit" value="Delete"/>
                        </form>
                    </td>
                </tr>
                <%
                        }
                    }
                %>
            </table>
        <p/>
        <hr/>

        <a href="shopping.jsp">Do another search</a><br/>
        <a href="checkout.jsp">Checkout and Pay</a>
    </body>
</html>
