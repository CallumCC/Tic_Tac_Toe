import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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
    @FXML private Label winLabel;
    
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
    
    private String oneXO = null;
    private String twoXO = null;
    private String threeXO = null;
    private String fourXO = null;
    private String fiveXO = null;
    private String sixXO = null;
    private String sevenXO = null;
    private String eightXO = null;
    private String nineXO = null;

    @FXML 
    void oneSelect(MouseEvent event) {
        gc1 = one.getGraphicsContext2D();

    	if(clickOne == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc1.drawImage(x, 15, 15);
        		oneXO = "x";
        	} else {
        		gc1.drawImage(o, 15, 15);
        		oneXO = "o";
        	}
    		clickOne = true;
        	checkWin();
    	}

    }

    @FXML
    void twoSelect(MouseEvent event) {
        gc2 = two.getGraphicsContext2D();

    	if(clickTwo == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc2.drawImage(x, 15, 15);
        		twoXO = "x";
        	} else {
        		gc2.drawImage(o, 15, 15);
        		twoXO = "o";
        	}
    		clickTwo = true;
        	checkWin();
    	}
    }

    @FXML
    void threeSelect(MouseEvent event) {
        gc3 = three.getGraphicsContext2D();
    	
    	if(clickThree == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc3.drawImage(x, 15, 15);
        		threeXO = "x";
        	} else {
        		gc3.drawImage(o, 15, 15);
        		threeXO = "o";
        	}
    		clickThree = true;
        	checkWin();
    	}
    }

    @FXML
    void fourSelect(MouseEvent event) {
        gc4 = four.getGraphicsContext2D();

    	if(clickFour == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc4.drawImage(x, 15, 15);
        		fourXO = "x";
        	} else {
        		gc4.drawImage(o, 15, 15);
        		fourXO = "o";
        	}
    		clickFour = true;
        	checkWin();
    	}
    }

    @FXML
    void fiveSelect(MouseEvent event) {
    	gc5 = five.getGraphicsContext2D();
    	
    	if(clickFive == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc5.drawImage(x, 15, 15);
        		fiveXO = "x";
        	} else {
        		gc5.drawImage(o, 15, 15);
        		fiveXO = "o";
        	}
    		clickFive = true;
        	checkWin();
    	}
    }

    @FXML
    void sixSelect(MouseEvent event) {
    	gc6 = six.getGraphicsContext2D();
    	
    	if(clickSix == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc6.drawImage(x, 15, 15);
        		sixXO = "x";
        	} else {
        		gc6.drawImage(o, 15, 15);
        		sixXO = "o";
        	}
    		clickSix = true;
        	checkWin();
    	}
    }

    @FXML
    void sevenSelect(MouseEvent event) {
    	gc7 = seven.getGraphicsContext2D();
    	
    	if(clickSeven == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc7.drawImage(x, 15, 15);
        		sevenXO = "x";
        	} else {
        		gc7.drawImage(o, 15, 15);
        		sevenXO = "o";
        	}
    		clickSeven = true;
        	checkWin();
    	}
    }

    @FXML
    void eightSelect(MouseEvent event) {
    	gc8 = eight.getGraphicsContext2D();
    	if(clickEight == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc8.drawImage(x, 15, 15);
        		eightXO = "x";
        	} else {
        		gc8.drawImage(o, 15, 15);
        		eightXO = "o";
        	}
    		clickEight = true;
        	checkWin();
    	}
    }

    @FXML
    void nineSelect(MouseEvent event) {
    	gc9 = nine.getGraphicsContext2D();
    	if(clickNine == false) {
        	takeTurn();
    		if(XorO == true) {
        		gc9.drawImage(x, 15, 15);
        		nineXO = "x";
        	} else {
        		gc9.drawImage(o, 15, 15);
        		nineXO = "o";
        	}
    		clickNine = true;
        	checkWin();
    	}
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
    	
    	winLabel.setText("");
    	
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
        
        oneXO = null;
        twoXO = null;
        threeXO = null;
        fourXO = null;
        fiveXO = null;
        sixXO = null;
        sevenXO = null;
        eightXO = null;
        nineXO = null;
        
    }

    public void takeTurn() {
    	if(turn % 2 == 0) {
    		XorO = true;
    	} else if(turn % 2 == 1) {
    		XorO = false;
    	}
    	turn++;
    }
    
    public void checkWin() {
    	if(clickOne && clickTwo && clickThree) {
    		if(oneXO.equals("x") && twoXO.equals("x") && threeXO.equals("x")) {
    			System.out.println("X WIN");
    			gc1.setFill(Color.DEEPPINK);
    			gc1.fillRect(0, 58, 133, 3);
    			gc2.setFill(Color.DEEPPINK);
    			gc2.fillRect(0, 58, 133, 3);
    			gc3.setFill(Color.DEEPPINK);
    			gc3.fillRect(0, 58, 133, 3);
    			win("X");
    		} else if(oneXO.equals("o") && twoXO.equals("o") && threeXO.equals("o")) {
    			System.out.println("O WIN");
    			gc1.setFill(Color.DEEPPINK);
    			gc1.fillRect(0, 58, 133, 3);
    			gc2.setFill(Color.DEEPPINK);
    			gc2.fillRect(0, 58, 133, 3);
    			gc3.setFill(Color.DEEPPINK);
    			gc3.fillRect(0, 58, 133, 3);
    			win("O");
    		} 
    	}
    	if(clickFour && clickFive && clickSix) {
    		if(fourXO.equals("x") && fiveXO.equals("x") && sixXO.equals("x")) {
    			System.out.println("X WIN");
    			gc4.setFill(Color.DEEPPINK);
    			gc4.fillRect(0, 58, 133, 3);
    			gc5.setFill(Color.DEEPPINK);
    			gc5.fillRect(0, 58, 133, 3);
    			gc6.setFill(Color.DEEPPINK);
    			gc6.fillRect(0, 58, 133, 3);
    			win("X");
    		} else if(fourXO.equals("o") && fiveXO.equals("o") && sixXO.equals("o")) {
    			System.out.println("O WIN");
    			gc4.setFill(Color.DEEPPINK);
    			gc4.fillRect(0, 58, 133, 3);
    			gc5.setFill(Color.DEEPPINK);
    			gc5.fillRect(0, 58, 133, 3);
    			gc6.setFill(Color.DEEPPINK);
    			gc6.fillRect(0, 58, 133, 3);
    			win("O");
    		} 
    	}
    	if(clickSeven && clickEight && clickNine) {
    		if(sevenXO.equals("x") && eightXO.equals("x") && nineXO.equals("x")) {
    			System.out.println("X WIN");
    			gc7.setFill(Color.DEEPPINK);
    			gc7.fillRect(0, 58, 133, 3);
    			gc8.setFill(Color.DEEPPINK);
    			gc8.fillRect(0, 58, 133, 3);
    			gc9.setFill(Color.DEEPPINK);
    			gc9.fillRect(0, 58, 133, 3);
    			win("X");
    		} else if(sevenXO.equals("o") && eightXO.equals("o") && nineXO.equals("o")) {
    			System.out.println("O WIN");
    			gc7.setFill(Color.DEEPPINK);
    			gc7.fillRect(0, 58, 133, 3);
    			gc8.setFill(Color.DEEPPINK);
    			gc8.fillRect(0, 58, 133, 3);
    			gc9.setFill(Color.DEEPPINK);
    			gc9.fillRect(0, 58, 133, 3);
    			win("O");
    		}
    	}
    	if(clickOne && clickFour && clickSeven) {
    		if(oneXO.equals("x") && fourXO.equals("x") && sevenXO.equals("x")) {
    			System.out.println("X WIN");
    			gc1.setFill(Color.DEEPPINK);
    			gc1.fillRect(67, 0, 3, 133);
    			gc4.setFill(Color.DEEPPINK);
    			gc4.fillRect(67, 0, 3, 133);
    			gc7.setFill(Color.DEEPPINK);
    			gc7.fillRect(67, 0, 3, 133);
    			win("X");
    		} else if(oneXO.equals("o") && fourXO.equals("o") && sevenXO.equals("o")) {
    			System.out.println("O WIN");
    			gc1.setFill(Color.DEEPPINK);
    			gc1.fillRect(67, 0, 3, 133);
    			gc4.setFill(Color.DEEPPINK);
    			gc4.fillRect(67, 0, 3, 133);
    			gc7.setFill(Color.DEEPPINK);
    			gc7.fillRect(67, 0, 3, 133);
    			win("O");
    		} 
    	}
    	if(clickTwo && clickFive && clickEight) {
    		if(twoXO.equals("x") && fiveXO.equals("x") && eightXO.equals("x")) {
    			System.out.println("X WIN");
    			gc2.setFill(Color.DEEPPINK);
    			gc2.fillRect(67, 0, 3, 133);
    			gc5.setFill(Color.DEEPPINK);
    			gc5.fillRect(67, 0, 3, 133);
    			gc8.setFill(Color.DEEPPINK);
    			gc8.fillRect(67, 0, 3, 133);
    			win("X");
    		} else if(twoXO.equals("o") && fiveXO.equals("o") && eightXO.equals("o")) {
    			System.out.println("O WIN");
    			gc2.setFill(Color.DEEPPINK);
    			gc2.fillRect(67, 0, 3, 133);
    			gc5.setFill(Color.DEEPPINK);
    			gc5.fillRect(67, 0, 3, 133);
    			gc8.setFill(Color.DEEPPINK);
    			gc8.fillRect(67, 0, 3, 133);
    			win("O");
    		} 
    	}
    	if(clickThree && clickSix && clickNine) {
    		if(threeXO.equals("x") && sixXO.equals("x") && nineXO.equals("x")) {
    			System.out.println("X WIN");
    			gc3.setFill(Color.DEEPPINK);
    			gc3.fillRect(67, 0, 3, 133);
    			gc6.setFill(Color.DEEPPINK);
    			gc6.fillRect(67, 0, 3, 133);
    			gc9.setFill(Color.DEEPPINK);
    			gc9.fillRect(67, 0, 3, 133);
    			win("X");
    		} else if(threeXO.equals("o") && sixXO.equals("o") && nineXO.equals("o")) {
    			System.out.println("O WIN");
    			gc3.setFill(Color.DEEPPINK);
    			gc3.fillRect(67, 0, 3, 133);
    			gc6.setFill(Color.DEEPPINK);
    			gc6.fillRect(67, 0, 3, 133);
    			gc9.setFill(Color.DEEPPINK);
    			gc9.fillRect(67, 0, 3, 133);
    			win("O");
    		} 
    	}
    	if(clickOne && clickFive && clickNine) {
    		if(oneXO.equals("x") && fiveXO.equals("x") && nineXO.equals("x")) {
    			System.out.println("X WIN");
    			gc1.setStroke(Color.DEEPPINK);
    			gc1.setLineWidth(4);
    			gc1.strokeLine(0, 0, 133, 133);
    			gc5.setStroke(Color.DEEPPINK);
    			gc5.setLineWidth(4);
    			gc5.strokeLine(0, 0, 133, 133);
    			gc9.setStroke(Color.DEEPPINK);
    			gc9.setLineWidth(4);
    			gc9.strokeLine(0, 0, 133, 133);
    			win("X");
    		} else if(oneXO.equals("o") && fiveXO.equals("o") && nineXO.equals("o")) {
    			System.out.println("O WIN");
    			gc1.setStroke(Color.DEEPPINK);
    			gc1.setLineWidth(4);
    			gc1.strokeLine(0, 0, 133, 133);
    			gc5.setStroke(Color.DEEPPINK);
    			gc5.setLineWidth(4);
    			gc5.strokeLine(0, 0, 133, 133);
    			gc9.setStroke(Color.DEEPPINK);
    			gc9.setLineWidth(4);
    			gc9.strokeLine(0, 0, 133, 133);
    			win("O");
    		} 
    	}
    	if(clickThree && clickFive && clickSeven) {
    		if(threeXO.equals("x") && fiveXO.equals("x") && sevenXO.equals("x")) {
    			System.out.println("X WIN");
    			gc3.setStroke(Color.DEEPPINK);
    			gc3.setLineWidth(4);
    			gc3.strokeLine(133, 0, 0, 133);
    			gc5.setStroke(Color.DEEPPINK);
    			gc5.setLineWidth(4);
    			gc5.strokeLine(133, 0, 0, 133);
    			gc7.setStroke(Color.DEEPPINK);
    			gc7.setLineWidth(4);
    			gc7.strokeLine(133, 0, 0, 133);
    			win("X");
    		} else if(threeXO.equals("o") && fiveXO.equals("o") && sevenXO.equals("o")) {
    			System.out.println("O WIN");
    			gc3.setStroke(Color.DEEPPINK);
    			gc3.setLineWidth(4);
    			gc3.strokeLine(133, 0, 0, 133);
    			gc5.setStroke(Color.DEEPPINK);
    			gc5.setLineWidth(4);
    			gc5.strokeLine(133, 0, 0, 133);
    			gc7.setStroke(Color.DEEPPINK);
    			gc7.setLineWidth(4);
    			gc7.strokeLine(133, 0, 0, 133);
    			win("O");
    		} 
    	}
    }
    
    public void win(String a) {
    	winLabel.setText(a + " wins!");
    	/*
    	if(clickOne == false) {
    		clickOne = true;
    	}
    	if(clickTwo == false) {
    		clickTwo = true;
    	}
    	if(clickThree == false) {
    		clickThree = true;
    	}
    	if(clickFour == false) {
    		clickFour = true;
    	}
    	if(clickFive = false) {
    		clickFive = true;
    	}
    	if(clickSix = false) {
    		clickSix = true;
    	}
    	if(clickSeven = false) {
    		clickSeven = true;
    	}
    	if(clickEight = false) {
    		clickEight = true;
    	}
    	if(clickNine = false) {
    		clickNine = true;
    	} */
    	
    	/*clickOne = true;
    	clickTwo = true;
    	clickThree = true;
    	clickFour = true;
    	clickFive = true;
    	clickSix = true;
    	clickSeven = true;
    	clickEight = true;
    	clickNine = true;*/
    }
    
    @FXML
    void quit(ActionEvent event) {

    	System.exit(0);
    }

}
