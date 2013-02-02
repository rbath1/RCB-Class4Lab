package calculatorController;

import Challenge2.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Robert Bath
 */
public class calcController extends HttpServlet {
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        String l = request.getParameter("length");
//        String w = request.getParameter("width");
//        String r = request.getParameter("radius");
//        String triA = request.getParameter("triA");
//        String triB = request.getParameter("triB");
//        
//        double answer = 0;
//        
//       
//        try {
//            /* TODO output your page here. You may use following sample code. */
//      //      out.println("<html>");
//        //    out.println("<head>");
//        //    out.println("<title>AREA</title>");            
//          //  out.println("</head>");
//          //  out.println("<body>");
//          //  out.println("<h1 align='center'> Calculator Result" + "</h1>");
//            if(l!=null && w!=null){
//            double length = Double.parseDouble(l);
//            double width = Double.parseDouble(w);
//            answer = length * width;
//            out.println("<p>The area of the circle is: " + answer);
//        } else if (r!=null){
//            double radius = Double.parseDouble(r);
//            answer = (3.14159265359 * (radius*radius));
//            out.println("<p>The area of the rectangle/square is: " + answer + "</p>");
//        } else if (triA!=null && triB!=null){
//             double sideA = Double.parseDouble(triA);
//             double sideB = Double.parseDouble(triB);
//             double sideC;
//             sideA = sideA * sideA;
//             sideB = sideB * sideB;
//             sideC = sideA + sideB;
//             sideC = Math.sqrt(sideC);
//             answer = sideC;
//             out.println("<p>The length of the hypotenuse is: " + answer + "</p>");
//             
//        } 
//         //   out.println("<p>The Calculation is: " + answer + "</p>");
//          //  out.println("</body>");
//          //  out.println("</html>");
//        } finally {            
//            out.close();
//        }
//        
//        request.setAttribute("Answer", answer);
//        
//        RequestDispatcher view =
//                request.getRequestDispatcher(RESULT_PAGE);
//        view.forward(request, response);
//        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        
        response.setContentType("text/html");
        String l = request.getParameter("length");
        String w = request.getParameter("width");
        String r = request.getParameter("radius");
        String triA = request.getParameter("triA");
        String triB = request.getParameter("triB");
        
        double answer = 0;
        
       String ResultPage = null;
        try {
            if(l!=null && w!=null){
            rectangleModel rm = new rectangleModel();
            answer = rm.getArea(l, w);
            ResultPage = "Challenge2areaForm.jsp";
           
        } else if (r!=null){
            circleModel cm = new circleModel();
            answer = cm.getArea(r);
            ResultPage = "Challenge2circleForm.jsp";
            
        } else if (triA!=null && triB!=null){
            triangleModel tm = new triangleModel();
            answer = tm.getHypotenuse(triA, triB);
            ResultPage = "Challenge2hypoForm.jsp";
        } 
        } finally {
            
        }
        
        request.setAttribute("Answer", answer);
        
        RequestDispatcher view =
                request.getRequestDispatcher(ResultPage);
        view.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
