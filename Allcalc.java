//project on creating calculator using EditPlus Notepad.
import java.awt.*;
import java.awt.event.*;
class  Allcalc extends Frame implements ActionListener
{
	//Declaring Awt Components.
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	Allcalc()
	{
		//Giving Layout to the Frame explicitly using FlowLayout.
		setLayout(new FlowLayout());
		Font f=new Font("arial",Font.BOLD,20);
		//Creating and Setting Font TO GUI components.
		Font f1=new Font("Tahoma",Font.BOLD,35);
		l4=new Label("Calculator in java");
		l4.setFont(f1);
		l4.setBackground(Color.BLUE);
		l4.setForeground(Color.RED);
		l1=new Label("First  Number:");
		l1.setFont(f);
		l1.setBackground(Color.CYAN);
		l1.setForeground(Color.BLACK);
		l2=new Label("Second Number:");
		l2.setFont(f);
        l2.setBackground(Color.CYAN);
		l2.setForeground(Color.BLACK);
        l3=new Label("Result:");
		l3.setFont(f);
		l3.setBackground(Color.CYAN);
		l3.setForeground(Color.BLACK);
		t1=new TextField(12);
		t1.setFont(f);
		t2=new TextField(12);
		t2.setFont(f);
		t3=new TextField(12);
		t3.setFont(f);
		b1=new Button("Add");
		b1.setFont(f);
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.BLACK);
		b2=new Button("Subtract");
		b2.setFont(f);
		b2.setBackground(Color.GREEN);
		b2.setForeground(Color.BLACK);
		b3=new Button("Multiply");
		b3.setFont(f);
		b3.setBackground(Color.GREEN);
		b3.setForeground(Color.BLACK);
		b4=new Button("Divide");
		b4.setFont(f);
		b4.setBackground(Color.GREEN);
		b4.setForeground(Color.BLACK);

         
		//Adding GUI Components to the Frame.
		add(l4);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);

        //Registering Listeners to the Awt GUI components.
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

        //Activating Cross Button of the Frame.
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
     }
	 //Defining event handler method.
	 public void actionPerformed(ActionEvent ae)
	 {
        double a,b,c;
		a=Double.parseDouble(t1.getText());
		b=Double.parseDouble(t2.getText());
		if(ae.getSource()==b1)
		 {
			c=a+b;
			t3.setText(c+"");
		 }
		  
		 if(ae.getSource()==b2)
		 {
			c=a-b;
			t3.setText(c+"");
		 }
		 if(ae.getSource()==b3)
		 {
			c=a*b;
			t3.setText(c+"");
		 }
		 if(ae.getSource()==b4)
		 {
			c=a/b;
			t3.setText(c+"");
		 }
	}
	//Setting Font To the Frame Components.
	public void paint(Graphics g)
	{
		Font f1=new Font("arial",Font.BOLD,18);
		g.setFont(f1);

	}
    //Defining Main method and defining attributes of the Frame.
	public static void main(String[] args) 
	{
		 Allcalc obj=new Allcalc();
		 obj.setBackground(Color.YELLOW);
		 obj.setSize(400,500);
		 obj.setTitle("CALCULATOR DEMO");
		 obj.setVisible(true);
	}
}
