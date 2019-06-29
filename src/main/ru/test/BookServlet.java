package main.ru.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1L, "Java","Schildt"));
        books.add(new Book(2L,"HTML","Smith"));
        books.add(new Book(3L,"SQL","Grabber"));

        req.setAttribute("bookList",books);

        getServletContext().getRequestDispatcher("/books.jsp").forward(req, resp);



    }
}
