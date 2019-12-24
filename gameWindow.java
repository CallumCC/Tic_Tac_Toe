import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class gameWindow {

    @FXML private Canvas one;
    @FXML private Canvas two;
    @FXML private Canvas three;
    @FXML private Canvas four;
    @FXML private Canvas five;
    @FXML private Canvas six;
    @FXML private Canvas seven;
    @FXML private Canvas eight;
    @FXML private Canvas nine;
    
    private Image x = new Image("X.png", 100, 100, false, false);
    private Image o = new Image("O.png", 100, 100, false, false);
    
    private boolean XorO;
    
    private boolean clickOne = false;
    private boolean clickTwo = false;
    private boolean clickThree = false;
    private boolean clickFour = false;
    private boolean clickFive = false;
    private boolean clickSix = false;
    private boolean clickSeven = false;
    private boolean clickEight = false;
    private boolean clickNine = false;
    
    private int turn = 0;
    
    GraphicsContext gc1;
    GraphicsContext gc2;
    GraphicsContext gc3;
    GraphicsContext gc4;
    GraphicsContext gc5;
    GraphicsContext gc6;
    GraphicsContext gc7;
    GraphicsContext gc8;
    GraphicsContext gc9;

    @FXML 
    void oneSelect(MouseEvent event) {
        gc1 = one.getGraphicsContext2D();

    	if(clickOne == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc1.drawImage(x, 15, 15);
        	} else {
        		gc1.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickOne = true;
    	checkFinish();
    }

    @FXML
    void twoSelect(MouseEvent event) {
        gc2 = two.getGraphicsContext2D();

    	if(clickTwo == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc2.drawImage(x, 15, 15);
        	} else {
        		gc2.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickTwo = true;
    	checkFinish();

    }

    @FXML
    void threeSelect(MouseEvent event) {
        gc3 = three.getGraphicsContext2D();
    	
    	if(clickThree == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc3.drawImage(x, 15, 15);
        	} else {
        		gc3.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickThree = true;
    	checkFinish();

    }

    @FXML
    void fourSelect(MouseEvent event) {
        gc4 = four.getGraphicsContext2D();

    	if(clickFour == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc4.drawImage(x, 15, 15);
        	} else {
        		gc4.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickFour = true;
    	checkFinish();

    }

    @FXML
    void fiveSelect(MouseEvent event) {
    	gc5 = five.getGraphicsContext2D();
    	
    	if(clickFive == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc5.drawImage(x, 15, 15);
        	} else {
        		gc5.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickFive = true;
    	checkFinish();

    }

    @FXML
    void sixSelect(MouseEvent event) {
    	gc6 = six.getGraphicsContext2D();
    	
    	if(clickSix == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc6.drawImage(x, 15, 15);
        	} else {
        		gc6.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickSix = true;
    	checkFinish();

    }

    @FXML
    void sevenSelect(MouseEvent event) {
    	gc7 = seven.getGraphicsContext2D();
    	
    	if(clickSeven == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc7.drawImage(x, 15, 15);
        	} else {
        		gc7.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickSeven = true;
    	checkFinish();

    }

    @FXML
    void eightSelect(MouseEvent event) {
    	gc8 = eight.getGraphicsContext2D();
    	if(clickEight == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc8.drawImage(x, 15, 15);
        	} else {
        		gc8.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickEight = true;
    	checkFinish();

    }

    @FXML
    void nineSelect(MouseEvent event) {
    	gc9 = nine.getGraphicsContext2D();
    	if(clickNine == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc9.drawImage(x, 15, 15);
        	} else {
        		gc9.drawImage(o, 15, 15);
        	}
    	}
    	
    	clickNine = true;
    	checkFinish();

    }
    
    @FXML
    void restart(ActionEvent event) {
    	System.out.println("restrt");
    	
    	if(clickOne == true) {
    		gc1.clearRect(0, 0, 133, 133);
    	}
    	if(clickTwo == true) {
    		gc2.clearRect(0, 0, 133, 133);
    	}
    	if(clickThree == true) {
    		gc3.clearRect(0, 0, 133, 133);
    	}
    	if(clickFour == true) {
    		gc4.clearRect(0, 0, 133, 133);
    	}
    	if(clickFive == true) {
    		gc5.clearRect(0, 0, 133, 133);
    	}
    	if(clickSix == true) {
    		gc6.clearRect(0, 0, 133, 133);
    	}
    	if(clickSeven == true) {
    		gc7.clearRect(0, 0, 133, 133);
    	}
    	if(clickEight == true) {
    		gc8.clearRect(0, 0, 133, 133);
    	}
    	if(clickNine == true) {
    		gc9.clearRect(0, 0, 133, 133);
    	}
    	
    	clickOne = false;
        clickTwo = false;
        clickThree = false;
        clickFour = false;
        clickFive = false;
        clickSix = false;
        clickSeven = false;
        clickEight = false;
        clickNine = false;
        
        turn = 0;
    }
    
    public void checkFinish() {
    	if(clickOne == true && clickTwo == true && clickThree == true && clickFour == true 
    			&& clickFive == true && clickSix == true && clickSeven == true && clickEight == true
    			&& clickNine == true) {
    		
    		System.out.println("Finished");
    	}
    }
    
    public void takeTurn() {
    	if(turn % 2 == 0) {
    		XorO = true;
    	} else if(turn % 2 == 1) {
    		XorO = false;
    	}
    	turn++;
    }

}
