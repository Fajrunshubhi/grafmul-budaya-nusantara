/* autogenerated by Processing revision 1282 on 2022-06-30 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Main extends PApplet {


 public void setup() {
  /* size commented out by preprocessor */;
    background(255, 255, 0);
}

 public void draw(){
Person.Guru person = new Person.Guru();
person.drawBody();
}


// import processing.pdf.*;

// void setup() {
//   size(1024, 768, PDF);
// }

// void draw() {
//   line(0, 0, width, height);
//   line(0, height, width, 0);
// }


  public void settings() { size(600, 400); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Main" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
