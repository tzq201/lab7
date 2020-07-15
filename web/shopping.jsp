<%-- 
    Document   : shopping
    Created on : 3 Jul, 2020, 8:38:29 PM
    Author     : tzq20
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Page</title>
        <style>
            .btn {
                    border: none;
                    outline: none;
                    padding: 12px 16px;
                    background-color: #f1f1f1;
                    cursor: pointer;
                  }

                  /* Add a light grey background on mouse-over */
                  .btn:hover {
                    background-color: #ddd;
                  }

                  /* Add a dark background to the active button */
                  .btn.active {
                    background-color: #666;
                    color: white;
                  }
        </style>
    </head>
    <body>
        <h1>Online Portal </h1>
        
        <div id="myBtnContainer">
            <button class="btn active" onclick="filterSelection('All')"> All</button>
            <button class="btn" onclick="filterSelection('cars')"> Cars</button>
            <button class="btn" onclick="filterSelection('animals')"> Animals</button>
            <button class="btn" onclick="filterSelection('fruits')"> Fruits</button>
            <button class="btn" onclick="filterSelection('colors')"> Colors</button>
        </div>
        <form action="search" method="post">
            <p>
                Please enter product: <br/>
                <input type="text" name="searchterm" required/><br/>
                <input type="submit" value="Search"/>
            </p>
        </form>
    </body>
</html>
