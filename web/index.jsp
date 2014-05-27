<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "pack.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="index.css" rel="stylesheet" type="type/css" media="screen">
        <title>Kijkwijzer</title>
     <%
            Filmlijst films;
            
            films = new Filmlijst();
        
            films.voegtoefilm();
            
            int i = 0;
            
            if(request.getParameter("submit") != null){
                i = Integer.parseInt(request.getParameter("lijst"));
            }
            
   
      %>   
    </head>
    <body>
        <div id ="wrapper">
            <img src="images/logo_kijkwijzer.gif" alt="baasopa">
            <div id="content">
                <form action="#" method="post">
                    <select name="lijst" id="opa">
                        <option value="" selected disabled>Selecteer een film</option>
                        <option value="0">X-Men: Days of Future Past</option>
                        <option value="1">Blended</option>
                        <option value="2">Cold in July</option>
                        <option value="3">Stand clear of the closing doors</option>
                        <option value="4">Words and Pictures</option>
                        <option value="5">The angriest man in Brooklyn</option>
                    </select>
                
                <button type="submit" name="submit" id="verzenden">Verzend</button>
                </form>
               <%  if(request.getParameter("submit")!= null){ %>
                   <%=    films.getOpvraag(i) %>
               <% } %>
                       
            </div>
        </div>
        
    </body>
</html>
