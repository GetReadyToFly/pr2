import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Book;
import Controller.BookDB;


@WebServlet("/look")
public class Lib extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType ("text/html; charset=UTF-8");
        ArrayList<Book> books = BookDB.select();
        request.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/look.jsp").forward(request, response);
    }
}