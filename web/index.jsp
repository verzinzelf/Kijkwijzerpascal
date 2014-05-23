<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "Kijkwijzer.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="index.css" rel="stylesheet" type="type/css" media="screen">
        <title>Kijkwijzer</title>
     <%
            Kijkwijzer kijk;
            
            kijk = new Kijkwijzer();
        
            kijk.voegtoefilm();
   
      %>   
    </head>
    <body>
        <div id ="wrapper">
            <img src="images/logo_kijkwijzer.gif" alt="baasopa">
            <div id="content">
                <form>
                    <select id="opa">
                        <option value="film0" selected disabled>Selecteer een film</option>
                        <option value="film1">X-Men: Days of Future Past</option>
                        <option value="film2">Blended</option>
                        <option value="film3">Cold in July</option>
                        <option value="film4">Stand clear of the closing doors</option>
                        <option value="film5">Words and Pictures</option>
                        <option value="film6">The angriest man in Brooklyn</option>
                    </select>
                
                <button type="submit" id="verzenden">Verzend</button>
                </form>
               <%=kijk.maakPagina() %>
            </div>
        </div>
        
    </body>
</html>
