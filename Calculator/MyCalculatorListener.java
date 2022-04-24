package Calculator;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class MyCalculatorListener implements ActionListener{

    private JLabel label ;

    public MyCalculatorListener(JLabel label) {
        this.label = label;
    }
    public JLabel getLabel() {
        return label;
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if(!button.getText().equals("=")&& !button.getText().equalsIgnoreCase("C")){
            getLabel().setText(getLabel().getText() + button.getText());
        }

        else if (button.getText().equals("=")){
            String txt = getLabel().getText();
            String arr[];
            ArrayList<Double> arl = new ArrayList<Double>();
            if (txt.contains("x") && !txt.contains("/") && !txt.contains("+") && !txt.contains("-")){
                arr = txt.split("x");
                for(int i =0;i<arr.length;i++){
                    double number = Double.parseDouble(arr[i]);
                    arl.add(number);
                }
                Double sol = arl.get(0);
                for(int i =1;i< arl.size();i++){
                    sol *= arl.get(i);
                }
                getLabel().setText(sol.toString());
            }
            else if (txt.contains("/") && !txt.contains("x") && !txt.contains("+") && !txt.contains("-")){
                arr = txt.split("\\/");
                for(int i =0;i<arr.length;i++){
                    double number = Double.parseDouble(arr[i]);
                    arl.add(number);
                }
                Double sol = arl.get(0);
                for(int i =1;i< arl.size();i++){
                    sol /= arl.get(i);
                }
                getLabel().setText(sol.toString());
            }
            else if (txt.contains("-") && !txt.contains("/") && !txt.contains("+") && !txt.contains("x")){
                arr = txt.split("\\-");
                for(int i =0;i<arr.length;i++){
                    double number = Double.parseDouble(arr[i]);
                    arl.add(number);
                }
                Double sol = arl.get(0);
                for(int i =1;i< arl.size();i++){
                    sol -= arl.get(i);
                }
                getLabel().setText(sol.toString());
            }
            else if (txt.contains("+") && !txt.contains("/") && !txt.contains("x") && !txt.contains("-")){
                arr = txt.split("\\+");
                for(int i =0;i<arr.length;i++){
                    double number = Double.parseDouble(arr[i]);
                    arl.add(number);
                }
                Double sol = arl.get(0);
                for(int i =1;i< arl.size();i++){
                    sol += arl.get(i);
                }
                getLabel().setText(sol.toString());
            }
            else if (txt.contains("+") && txt.contains("/") || txt.contains("x") && txt.contains("-")||
                    txt.contains("+") && txt.contains("-") || txt.contains("/") && txt.contains("-")||
                    txt.contains("x") && txt.contains("+") || txt.contains("x") && txt.contains("/")){
                getLabel().setText("Error");
            }

        }
        else if (button.getText().equals("C")){
            getLabel().setText(" ");
        }

    }

}
