<html>
<title> Test Applet Page </title>
    <body>
      <applet code="HelloWorld" width=200 height=200>
      </applet>
    </body>
</html>    
import java.awt.*;
   import java.applet.*;
 
   public class HelloWorld extends Applet
   {	
     public void paint(Graphics g)
     {
       g.drawString("Hello World!",20,20);
     }
   }