<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <style>
    *{margin-bottom: 30px}
    a{
      text-decoration: none;
    }
  </style>

</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<a href="/products"><h1>PRODUCT MANAGEMENT</h1></a>


<h2>DELETE PRODUCT</h2>
<form action="/products/delete/${product.id}" method="post">
  <table class="table table-striped">
    <tr>
      <td>ID</td>
      <td><input type="text" name="id" disabled value="${product.id}" size="100"></td>
    </tr>
    <tr>
      <td>Name</td>
      <td><input type="text" name="name" disabled value="${product.name}" size="100"></td>
    </tr>
    <tr>
      <td>Price</td>
      <td><input type="text" name="price" disabled value="${product.price}" size="100"></td>
    </tr>
    <tr>
      <td>ID</td>
      <td><input type="text" name="description" disabled value="${product.description}" size="100"></td>
    </tr>
    <tr>
      <td>Avatar</td>
      <td><input type="text" name="img" disabled value="${product.image}" size="100"></td>
    </tr>
    <tr>
      <td></td>
      <td><input class="btn btn-primary" type="submit" value="Delete" size="100"></td>
    </tr>

  </table>
</form>
</body>
</html>
