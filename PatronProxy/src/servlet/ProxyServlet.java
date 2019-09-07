/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import video.Video;
import video.VideoProxy;



@WebServlet(name="LoginServlet" , urlPatterns = {"/page/proxy"})
public class ProxyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    	doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            {
        try{
            String action = request.getParameter("action");
            String idVideo = request.getParameter("idVideo");

            System.out.println("action="+action);
            System.out.println("idVideo="+idVideo);

            String url = null;

            if(action.contains("obtenerUrlVideo")){
                Video proxy = new VideoProxy();
                url = proxy.obtenerRutaVideo(idVideo);
            }

            response.setContentType("text/plain");
            PrintWriter salida = response.getWriter();

            salida.println(url);
            salida.close();
        }catch(Exception e){
            
        }
    }

   
   

}
