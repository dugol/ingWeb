<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ejemplo de laboratorio</title>
</head>

<body>
	<div class="container well">
		<form action="labServlet" method=POST>
			<table>
				<tr>
					<th><label><b>Nombre:</b></label></th>
					<th><input type="text" placeholder="Ingrese su nombre"
						class="form-control" name="nombre" required="" /></th>
				</tr>

				<tr>
					<th><label><b>Edad:</b></label></th>
					<th><input type="number" placeholder="Ingrese su edad"
						class="form-control" name="edad" required="" /></th>
				</tr>
				<tr>
					<th><label><b>Email:</b></label></th>
					<th><input type="email" placeholder="Ingrese su Email"
						class="form-control" name="email" required="" /></th>
				</tr>
				<div class="break"></div>
				</div>
				<tr>
					<td colspan="2">
					<input class="btn btn-info btn-lg"
						type="submit" value="Enviar datos" /> <span
						class="glyphicon glyphicon-lock"></span> 
						<input class="btn btn-info btn-lg" type="reset" value="cancelar"  /> <span
						class="glyphicon glyphicon-lock"></span>
				</tr>

			</table>
		</form>
</body>



</html>