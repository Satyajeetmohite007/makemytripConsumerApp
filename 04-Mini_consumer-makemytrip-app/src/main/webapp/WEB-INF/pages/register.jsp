<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>


<h1  style="color:red;text-align:center">Book Ticket</h1>

  <frm:form action="saveticket"  method="post" modelAttribute="data" >
    <table align="center" bgcolor="cyan">
      <tr>
        <td> Passanger Name:: </td>
        <td> <frm:input path="pasanger_name"/>  </td>
      </tr>
       <tr>
        <td> Passanger Age:: </td>
        <td> <frm:input path="age"/>  </td>
      </tr>
      
       <tr>
        <td> Passanger Source Location:: </td>
        <td> <frm:input path="passanger_Cl"/> </td>
      </tr>
 
       <tr>
        <td> Passanger Destination Location:: </td>
        <td> <frm:input path="passanger_Dst"/> </td>
      </tr>
      
       
      <tr>
        <td> <input type="submit" value="submit"></td>
        <td> <input type="reset" value="cancel">  </td>
      </tr>
    
    </table>
  </frm:form>
 
  