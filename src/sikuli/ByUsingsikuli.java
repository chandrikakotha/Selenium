package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class ByUsingsikuli {
	Screen s=new Screen();
  @Test
  public void sikulifunctions() throws FindFailed, InterruptedException {
	  s.click("E:\\screenshots\\silkuli\\windows.PNG");
	  Thread.sleep(3000);
	  s.click("E:\\screenshots\\silkuli\\click.PNG");
	  Thread.sleep(3000);
	  s.type("E:\\screenshots\\silkuli\\typesearch.PNG","snipping tool");
	  Thread.sleep(3000);
	  s.dragDrop("E:\\screenshots\\silkuli\\source.PNG","E:\\screenshots\\silkuli\\target.PNG");
	  s.doubleClick("E:\\screenshots\\silkuli\\lib.png");
	  
	  
	  
	  
	  
	  
  }
}
