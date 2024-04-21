
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page isELIgnored="false" %>

<c:choose>
   <c:when test="${!empty ticket}">
       <h1 style="color:red;text-align:center"> Ticket Details </h1>
        <table border="1" align="center" bgcolor="cyan">
            <tr style="color: red"><th>Ticket no </th><th>passanger name</th><th> Age </th> <th>Source Loc</th><th> destination</th><th> status </th>     </tr>
            <c:forEach var="tickt" items="${ticket}">
               <tr style="color: blue">
                <td>${tickt.ticket_no }</td>
                <td>${tickt.pasanger_name }</td>
                 <td>${tickt.age }</td>
                 <td>${tickt.passanger_Cl }</td>
                  <td>${tickt.passanger_Dst }</td>
                  <td>${tickt.status }</td>
               </tr>
            
            </c:forEach>
        </table>
   </c:when>
   <c:otherwise>
              <h1 style="color:red;text-align:center"> Ticket Not Found....... </h1>
   </c:otherwise>
</c:choose>
                                 <h2 style="color:green;text-align:center">${ticket}</h2>

