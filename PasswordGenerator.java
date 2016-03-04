//Import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
//Main class

public class PasswordGenerator
{
    
    //Declare variables
    static JFrame frame1;
    static Container pane;
    static JButton btnConnect, btnDisconnect;
    static JLabel lblServer, lblUsername, lblPassword, lblPort , lbluppercase ,lbllowercase , lblsymbol , lblnumber, output_lbl ;
    static JTextField txtServer, txtUsername, txtPassword, txtPort;
    static JTextArea output;
    /////
    static JCheckBox txtuppercase, txtlowercase , txtsymbol, txtnumber ;
    
    static Insets insets;
 
    public static void main (String args[])
    {
        
        //Set Look and Feel
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
        catch (UnsupportedLookAndFeelException e) {}

        //Create the frame

        frame1 = new JFrame ("   Password Generator   ");
        frame1.setSize (800,300);
        pane = frame1.getContentPane();
        insets = pane.getInsets();
        pane.setLayout (null);
        
        //Create controls
        btnConnect = new JButton ("   Generate Password  ");
        btnDisconnect = new JButton ("Disconnect");
        
        lblServer = new JLabel ("First Name:");
        lblUsername = new JLabel ("Last Name:");
        lblPassword = new JLabel ("Your Favorate String / Character / Number:");
        lblPort = new JLabel ("Length of Password:");
       /////
        lbluppercase = new JLabel ("Upper Case");
        lbllowercase = new JLabel ("Lower Case");
        
        lblsymbol = new JLabel ("Symbol");
        lblnumber = new JLabel ("Number");
        
        output_lbl = new JLabel (" PASSWORD ");
        
        txtServer = new JTextField (10);
        txtUsername = new JTextField (10);
        txtPassword = new JTextField (10);
        
        ////
        txtPort = new JTextField  (5);
        ///checkbox
        txtuppercase = new JCheckBox(" ");
        txtlowercase = new JCheckBox(" ");
        
        txtsymbol = new JCheckBox(" ");
        txtnumber = new JCheckBox(" ");
        
        output = new JTextArea (5,30);
       // output.setColumns(10);
        //output.setRows(3);
        
        
        
        //Add all components to panel
        pane.add (lblServer);
        pane.add (lblUsername);
        pane.add (lblPassword);
        pane.add (lblPort);
        
        pane.add (txtServer);
        pane.add (txtUsername);
        pane.add (txtPassword);
        pane.add (txtPort);
        
        pane.add (btnConnect);
        //pane.add (btnDisconnect);
        
        //////
        pane.add (lbluppercase);
        pane.add(txtuppercase);

        pane.add (lbllowercase);
        pane.add(txtlowercase);
        
        pane.add (lblsymbol);
        pane.add(txtsymbol);

        pane.add (lblnumber);
        pane.add(txtnumber);
        
        
        pane.add(output_lbl);
        pane.add(output);
        
        
        
        //Place all components
        lblServer.setBounds (insets.left + 5, insets.top + 5, lblServer.getPreferredSize().width, lblServer.getPreferredSize().height);
        txtServer.setBounds (lblServer.getX() + lblServer.getWidth() + 5, insets.top + 5, txtServer.getPreferredSize().width, txtServer.getPreferredSize().height);
        
        lblUsername.setBounds (txtServer.getX() + txtServer.getWidth() + 5, insets.top + 5, lblUsername.getPreferredSize().width, lblUsername.getPreferredSize().height);
        txtUsername.setBounds (lblUsername.getX() + lblUsername.getWidth() + 5, insets.top + 5, txtUsername.getPreferredSize().width, txtUsername.getPreferredSize().height);
        
        lblPassword.setBounds (txtUsername.getX() + txtUsername.getWidth() + 5, insets.top + 5, lblPassword.getPreferredSize().width, lblPassword.getPreferredSize().height);
        txtPassword.setBounds (lblPassword.getX() + lblPassword.getWidth() + 5, insets.top + 5, txtPassword.getPreferredSize().width, txtPassword.getPreferredSize().height);
        
        lblPort.setBounds (txtPassword.getX() + txtPassword.getWidth() + 5, insets.top + 5, lblPort.getPreferredSize().width, lblPort.getPreferredSize().height);
        txtPort.setBounds (lblPort.getX() + lblPort.getWidth() + 5, insets.top + 5, txtPort.getPreferredSize().width, txtPort.getPreferredSize().height);
            
        ///cases
        lbluppercase.setBounds (insets.left + 5, insets.top + 35, lbluppercase.getPreferredSize().width, lbluppercase.getPreferredSize().height);
        txtuppercase.setBounds (lbluppercase.getX() + lbluppercase.getWidth() + 5, insets.top + 35, txtuppercase.getPreferredSize().width, txtuppercase.getPreferredSize().height);
                                
        lbllowercase.setBounds (txtuppercase.getX() + txtuppercase.getWidth() + 5, insets.top + 35, lbllowercase.getPreferredSize().width, lbllowercase.getPreferredSize().height);
        txtlowercase.setBounds (lbllowercase.getX() + lbllowercase.getWidth() + 5, insets.top + 35, txtlowercase.getPreferredSize().width, txtlowercase.getPreferredSize().height);
        
        ///symbol or number
        lblsymbol.setBounds (txtlowercase.getX() + txtlowercase.getWidth() + 5, insets.top + 35, lblsymbol.getPreferredSize().width, lblsymbol.getPreferredSize().height);
        txtsymbol.setBounds (lblsymbol.getX() + lblsymbol.getWidth() + 5, insets.top + 35, txtsymbol.getPreferredSize().width, txtsymbol.getPreferredSize().height);
        
        lblnumber.setBounds (txtsymbol.getX() + txtsymbol.getWidth() + 5, insets.top + 35, lblnumber.getPreferredSize().width, lblnumber.getPreferredSize().height);
        txtnumber.setBounds (lblnumber.getX() + lblnumber.getWidth() + 5, insets.top + 35, txtnumber.getPreferredSize().width, txtnumber.getPreferredSize().height);
                
        btnDisconnect.setBounds (insets.left + 15, lblServer.getY() + lblServer.getHeight() + 45, btnDisconnect.getPreferredSize().width, btnDisconnect.getPreferredSize().height);
        btnConnect.setBounds (insets.left + 115, lblServer.getY() + lblServer.getHeight() + 45, btnConnect.getPreferredSize().width, btnConnect.getPreferredSize().height);
       
        
        output_lbl.setBounds (insets.left + 5, insets.top + 125, output_lbl.getPreferredSize().width, output_lbl.getPreferredSize().height);
        output.setBounds (output_lbl.getX() + output_lbl.getWidth() + 5, insets.top + 105, output.getPreferredSize().width, output.getPreferredSize().height);
        
        
        
    //    btnConnect.setBounds (txtPort.getY() + txtPort.getWidth() + 5, insets.top + 15, btnConnect.getPreferredSize().width, btnConnect.getPreferredSize().height);
       
        //Set frame visible
        frame1.setVisible (true);
        
        //Button's action
        btnConnect.addActionListener(new btnConnectAction()); //Register action

        // set state
        txtuppercase.setSelected(true);  
        txtlowercase.setSelected(true);
        txtsymbol.setSelected(true);  
        txtnumber.setSelected(true);

        /////
         
        
          
        
        
    }


    public static class btnConnectAction implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
           /////random num & sym 
            final String symbol = "!@#$%&*";
            final int s = symbol.length();
            
            final String num = "0123456789";
            final int N = num.length();
            
            Random r = new Random();
 
            
            ////1st name
            String x = txtPort.getText();
            int pass_length = Integer.parseInt(x);
            System.out.println(" Password Length " + pass_length);
            
            String firstname = txtServer.getText();
            //convert to upper
            String case_upper = firstname.toUpperCase();
            char[] case_upper_array = case_upper.toCharArray();
            
            String case_lower = firstname.toLowerCase();            
            char[] case_lower_array = case_lower.toCharArray();
                       
            char[] stringToCharArray = firstname.toCharArray();
            System.out.println(firstname.length());
            
            ///last name
            String lastname = txtUsername.getText();
            
            String case_upper_last = lastname.toUpperCase();
            char[] case_upper_array_last = case_upper_last.toCharArray();
            
            String case_lower_last = lastname.toLowerCase();            
            char[] case_lower_array_last = case_lower_last.toCharArray();
            
            char[] stringToCharArray_1 = lastname.toCharArray();
            System.out.println(lastname.length());
            
            
            
            String favSrting = txtPassword.getText();
            
            String case_upper_fav = favSrting.toUpperCase();
            char[] case_upper_array_fav = case_upper_fav.toCharArray();
            
            String case_lower_fav = favSrting.toLowerCase();            
            char[] case_lower_array_fav = case_lower_fav.toCharArray();
            
            char[] stringToCharArray_2 = favSrting.toCharArray();
           
            int w =0;
            float z=0;
            int k;
            int rand = 0;
            //int w = pass_length/2;
           // float z = pass_length - w;
                
            if ((pass_length/2) <= firstname.length() && (pass_length/2) <= lastname.length())
            {
                w = pass_length/2;
                System.out.println(w);
                z = pass_length - w;
                System.out.println(z);
            }
            else if ((pass_length/2) >= firstname.length() && (pass_length/2) <= lastname.length())
            {
                w = firstname.length();
                System.out.println(w);
                k = pass_length - firstname.length();
                System.out.println(k);
                z = k;
            }
            else if ((pass_length/2) <= firstname.length() && (pass_length/2) >= lastname.length())
            {
                 z = lastname.length();
                 System.out.println(z);
                 k = pass_length - lastname.length();
                 System.out.println(k);
                 w = k;
            }
            else if(pass_length >= firstname.length() + lastname.length())
            {
                 w = firstname.length();
                 System.out.println(w);
                 z = lastname.length();
                 System.out.println(z);
                 rand =  pass_length -( lastname.length() + firstname.length());
                 System.out.println(rand);
            }
            
   
            
            System.out.println("  ");  
        ////        
 if (pass_length <= firstname.length() + lastname.length())
        {   ///1st case
            if (txtuppercase.isSelected() && txtlowercase.isSelected() && txtsymbol.isSelected() && txtnumber.isSelected())     
            {   /// 1st option
               
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }

                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    

                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
                
                /// 2nd option
                 for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                 
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(stringToCharArray_2[j]));                  
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                          
                
            }    
            ///////2 case
            else if (txtuppercase.isSelected() && txtsymbol.isSelected() && txtnumber.isSelected())     
            {
                /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j < (z)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
           
                output.append("\n");
                /// 2nd option

                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                for (int j = 0; j < (w)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
               
                
                output.append("\n");
                
                /// 3rd option
                
                //output.append( Character.toString(case_upper_array_last[0]));            
                //output.append( Character.toString(case_upper_array_last[1]));            
                
                for (int j = 0; j < (z)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                
                output.append("\n");
                
                /// 4th option
                
                
                //output.append( Character.toString(case_upper_array[0]));            
                //output.append( Character.toString(case_upper_array[1]));            
                
                for (int j = 0; j < (w)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }    
                for (int j = 0; j <w/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                
                
             System.out.print(" upper sym num are selected ");                    
            }
            ///3 case
            else if (txtlowercase.isSelected() && txtsymbol.isSelected() && txtnumber.isSelected())     
            {
                
                /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j < (z)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
           
                output.append("\n");
                /// 2nd option

                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                for (int j = 0; j < (w)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
               
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < (z)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < (z)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }    
                for (int j = 0; j <z/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                
                
             System.out.print("lower sym num are selected ");                    
            }///4 case
            else if (txtuppercase.isSelected() && txtlowercase.isSelected() && txtsymbol.isSelected() )     
            {
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
                /// 2nd option
                 for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                //output.append( Character.toString(num.charAt(r.nextInt(N))));
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));
                 
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(stringToCharArray_2[j]));                  
                }
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));
                          
                
             System.out.print(" upper sym low are selected ");                    
            } 
            ///5 case
            else if (txtuppercase.isSelected() && txtlowercase.isSelected() && txtnumber.isSelected())     
            {
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
               // output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
               
                /// 2nd option
                 for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                 
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(stringToCharArray_2[j]));                  
                }
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                  
                
                
                
             System.out.print(" upper low num are selected ");                    
            } 
            ///6 case
            else if (txtuppercase.isSelected() && txtlowercase.isSelected())     
            {
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
                /// 2nd option
                 for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                output.append( Character.toString(case_upper_array_last[0])); 
                for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                output.append( Character.toString(case_upper_array[0])); 
                for (int j = 1; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                 
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));                  
                }
                
                
                
             System.out.print(" upper lower are selected ");                    
            } 
           ///7 case
            else if (txtuppercase.isSelected() && txtsymbol.isSelected())     
            {
                /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
             //   output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
               
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                
             System.out.print("upper sym are selected ");                    
            }///8 case
            else if (txtlowercase.isSelected() && txtsymbol.isSelected())     
            {
                   /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
             //   output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
               
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < (z) ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
             
                
                
                
             System.out.print("lower sym are selected ");                    
            }///9 case
            else if (txtuppercase.isSelected() && txtnumber.isSelected())     
            {
                   /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
               
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                  output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
             
                
                
             System.out.print("upper num are selected ");                    
            }///10 case
            else if (txtlowercase.isSelected() && txtnumber.isSelected())     
            {
                   /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
              output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
               
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < (z) ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
             
                
                
                
             System.out.print("lower num are selected ");                    
            }
            else 
            {
             System.out.print("nothing is selected");                    
            }
        }
 else   ////random 
        {      int f = 0;
             if (rand % 2 == 0)
             {
             System.out.println("You entered an even number.");
             }else
             { 
                  f = 1;
             }  
                
            if (txtuppercase.isSelected() && txtlowercase.isSelected() && txtsymbol.isSelected() && txtnumber.isSelected())     
            {   /// 1st option
               
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <= rand/2 ;j++)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 }   
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }                
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
                
                /// 2nd option
                 for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                 for (int j = 0; j <= rand/2 ;j++)
                 {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                 for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                for (int j = 0; j <= rand/2 ;j++)
                 {
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                 }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                output.append("\n");
                
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                for (int j = 0; j <= rand/2 ;j++)
                 {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                 }
                 if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(stringToCharArray_2[j]));                  
                }
                for (int j = 0; j <= rand/2 ;j++)
                 {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                 }        
                 if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }  
                
            }    
            ////
            else if (txtuppercase.isSelected() && txtsymbol.isSelected() && txtnumber.isSelected())     
            {
                /// 1st option
               
                for (int j = 0; j <w-1 ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <= (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                 if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                for (int j = 0; j < (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                 if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }       
                
                output.append("\n");
                
                /// 3rd option
                
                //output.append( Character.toString(case_upper_array_last[0]));            
                //output.append( Character.toString(case_upper_array_last[1]));            
                
                for (int j = 0; j < (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                 if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                
                /// 4th option
                
                
                //output.append( Character.toString(case_upper_array[0]));            
                //output.append( Character.toString(case_upper_array[1]));            
                
                for (int j = 0; j < (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                 if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                
                 }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));                  
                } 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }    
                for (int j = 0; j <rand/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                 
                 }   
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }
                
             System.out.print(" upper sym num are selected ");                    
            }
            
            else if (txtlowercase.isSelected() && txtsymbol.isSelected() && txtnumber.isSelected())     
            {
                
            /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j <= (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <z-1 ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                for (int j = 0; j < (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }       
                
                output.append("\n");
                
                /// 3rd option
                
                //output.append( Character.toString(case_upper_array_last[0]));            
                //output.append( Character.toString(case_upper_array_last[1]));            
                
                for (int j = 0; j < (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                output.append("\n");
                
                /// 4th option
                
                
                //output.append( Character.toString(case_upper_array[0]));            
                //output.append( Character.toString(case_upper_array[1]));            
                
                for (int j = 0; j < (rand)/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                } 
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }    
                for (int j = 0; j <rand/2 ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }
                
             System.out.print(" lower sym num are selected ");                    
            }
            
            else if (txtuppercase.isSelected() && txtlowercase.isSelected() && txtsymbol.isSelected() )     
            {
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <rand ;j++)
                {    
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));    
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
                /// 2nd option
                 for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j <rand ;j++)
                {
                 output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));    
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                for (int j = 0; j <rand ;j++)
                {
                //output.append( Character.toString(num.charAt(r.nextInt(N))));
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                for (int j = 0; j <rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));
                }
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(stringToCharArray_2[j]));                  
                }
                for (int j = 0; j <rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));
                }         
                if(f==1)
                 {     
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
             System.out.print(" upper sym low are selected ");                    
            } 
            
            else if (txtuppercase.isSelected() && txtlowercase.isSelected() && txtnumber.isSelected())     
            {   //1st option
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <rand ;j++)
                {    
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                }
                if(f==1)
                 {     
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }        
                output.append("\n");
                /// 2nd option
                 for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j <rand ;j++)
                {
                // output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));    
                }
                if(f==1)
                 {     
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                 for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                for (int j = 0; j <rand ;j++)
                {
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                }
                if(f==1)
                 {     
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                for (int j = 0; j <rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                }
                if(f==1)
                 {     
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(stringToCharArray_2[j]));                  
                }
                for (int j = 0; j <rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));
                }         
                if(f==1)
                 {     
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));                     
                 }
                
                
             System.out.print(" upper low num are selected ");                    
            } 
            
            else if (txtuppercase.isSelected() && txtlowercase.isSelected())     
            {
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                } 
                
                ///
                while(rand != 0)
                {
                   for (int j = 0; j <z ;j++,rand-- )
                   {       
                output.append( Character.toString(case_upper_array[j]));            
                   }
                }
                
                
                output.append("\n");
                /// 2nd option
                 for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                output.append("\n");
                /// 3rd option
                output.append( Character.toString(case_upper_array[0]));
                 for (int j = 1; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }    
                output.append( Character.toString(case_upper_array_last[0])); 
                for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                output.append("\n");
                /// 4th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                output.append( Character.toString(case_upper_array[0])); 
                for (int j = 1; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));                  
                }
                 
                output.append("\n");
                /// 5th option
                output.append( Character.toString(case_upper_array_last[0]));
                 for (int j = 1; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }    
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));                  
                }
                
                
                
             System.out.print(" upper lower are selected ");                    
            } 
           
            else if (txtuppercase.isSelected() && txtsymbol.isSelected())     
            {
                /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
             //   output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                } 
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }    
                for (int j = 0; j <rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }
             System.out.print("upper sym are selected ");                    
            }
            else if (txtlowercase.isSelected() && txtsymbol.isSelected())     
            {
                  /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                //output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
             //   output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               // output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                } 
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }    
                for (int j = 0; j <rand ;j++)
                {
                output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                //output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }
                
             System.out.print("lower sym are selected ");                    
            }
            else if (txtuppercase.isSelected() && txtnumber.isSelected())     
            {
                 /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                for (int j = 0; j < rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));                  
                }
                
                for (int j = 0; j < rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < rand ;j++)
                {
               // output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                }
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < rand ;j++)
                {
               // output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array[j]));            
                } 
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_last[j]));            
                }
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }    
                for (int j = 0; j <rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_upper_array_fav[j]));            
                }
             System.out.print("upper num are selected ");                    
            }
            else if (txtlowercase.isSelected() && txtnumber.isSelected())     
            {
                  /// 1st option
               
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                for (int j = 0; j < rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                output.append("\n");
                
                /// 2nd option

                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));                  
                }
                
                for (int j = 0; j < rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
                output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                
                output.append("\n");
                
                /// 3rd option
                
                for (int j = 0; j < rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                }
                output.append("\n");
                
                
                /// 4th option
                for (int j = 0; j < rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s)))); 
               output.append( Character.toString(num.charAt(r.nextInt(N))));  
                }
                
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array[j]));            
                } 
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_last[j]));            
                }
                output.append("\n");
                
                /// 5th option
                
                for (int j = 0; j <w ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }    
                for (int j = 0; j <rand ;j++)
                {
                //output.append( Character.toString(symbol.charAt(r.nextInt(s))));
                output.append( Character.toString(num.charAt(r.nextInt(N))));                 
                }
                for (int j = 0; j <z ;j++)
                {
                output.append( Character.toString(case_lower_array_fav[j]));            
                }
                
             System.out.print("lower num are selected ");                    
            }
            else 
            {
             System.out.print("nothing is selected");                    
            }
        
        }
 
        }    
    
    }
}