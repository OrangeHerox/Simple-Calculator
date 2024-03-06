package com.simple_calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class settingMain {

    JFrame mainframe;
    JPanel mainpanel, toppanel;
    JButton zero, one, two, three, four, five, six, seven, eight, nine, point;
    JButton plus, minus, times, divide, equals, clearAll;
    JButton negative;
    JTextField output;

    String nprevious, npoint, nnegative;
    String nzero, none, ntwo, nthree, nfour, nfive, nsix, nseven, neight, nnine;
    String firstnum, secnum;

    int choices;
    double num1, num2, ans;

    boolean plusState, minusState, timesState, divideState, pointState, negativeState;

    public settingMain() {
        mainframe = new JFrame();
        mainpanel = new JPanel();
        toppanel = new JPanel();
        zero = new JButton();
        one = new JButton();
        two = new JButton();
        three = new JButton();
        four = new JButton();
        five = new JButton();
        six = new JButton();
        seven = new JButton();
        eight = new JButton();
        nine = new JButton();
        output = new JTextField();
        plus = new JButton();
        minus = new JButton();
        times = new JButton();
        divide = new JButton();
        point = new JButton();
        equals = new JButton();
        clearAll = new JButton();
        negative = new JButton();

        nzero = "0";
        none = "1";
        ntwo = "2";
        nthree = "3";
        nfour = "4";
        nfive = "5";
        nsix = "6";
        nseven = "7";
        neight = "8";
        nnine = "9";
        firstnum = "0";
        secnum = "0";
        num1 = 0.0;
        num2 = 0.0;
        ans = 0.0;
        plusState = false;
        minusState = false;
        timesState = false;
        divideState = false;
        pointState = false;
        negativeState = false;
        nprevious = "0";
        npoint = ".";
        nnegative = "-";
        choices = 0;
    }

    public void setMainGui() {
        //panel
        mainpanel.setBounds(0, 0, 525, 800);
        mainpanel.setBackground(new Color(21, 52, 80));
        mainpanel.setLayout(null);

        toppanel.setBounds(20, 20, 475, 80);
        toppanel.setBackground(new Color(143,188,219));
        toppanel.setLayout(null);

        mainpanel.add(zero);
        mainpanel.add(one);
        mainpanel.add(two);
        mainpanel.add(three);
        mainpanel.add(four);
        mainpanel.add(five);
        mainpanel.add(six);
        mainpanel.add(seven);
        mainpanel.add(eight);
        mainpanel.add(nine);
        mainpanel.add(plus);
        mainpanel.add(clearAll);
        mainpanel.add(negative);
        mainpanel.add(minus);
        mainpanel.add(times);
        mainpanel.add(divide);
        mainpanel.add(point);
        mainpanel.add(equals);
        toppanel.add(output);
        mainframe.add(toppanel);
        mainframe.add(mainpanel);

        //frame
        mainframe.setLayout(null);
        mainframe.setTitle("Simple Calculator");
        mainframe.setSize(535, 600);
        mainframe.setResizable(false);
        mainframe.setLocationRelativeTo(null);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
    }

    public void setOutput() {
        output.setBounds(10, 5, 455, 70);
        output.setHorizontalAlignment(SwingConstants.RIGHT);
        output.setBackground(Color.WHITE);
        output.setFont(new Font("SansSerif", Font.BOLD, 60));
        output.setEditable(false);
    }

    public void setButtons() {
        zero.setText("0");
        zero.setBounds(25, 350, 70, 70);
        zero.setBackground(new Color(68,114,148));
        zero.setForeground(Color.white);
        zero.setFont(new Font("SansSerif", Font.PLAIN, 40));
        zero.setFocusable(false);

        one.setText("1");
        one.setBounds(125, 350, 70, 70);
        one.setBackground(new Color(68,114,148));
        one.setForeground(Color.white);
        one.setFont(new Font("SansSerif", Font.PLAIN, 40));
        one.setFocusable(false);

        two.setText("2");
        two.setBounds(225, 350, 70, 70);
        two.setBackground(new Color(68,114,148));
        two.setForeground(Color.white);
        two.setFont(new Font("SansSerif", Font.PLAIN, 40));
        two.setFocusable(false);

        three.setText("3");
        three.setBounds(325, 350, 70, 70);
        three.setBackground(new Color(68,114,148));
        three.setForeground(Color.white);
        three.setFont(new Font("SansSerif", Font.PLAIN, 40));
        three.setFocusable(false);

        four.setText("4");
        four.setBounds(25, 250, 70, 70);
        four.setBackground(new Color(68,114,148));
        four.setForeground(Color.white);
        four.setFont(new Font("SansSerif", Font.PLAIN, 40));
        four.setFocusable(false);

        five.setText("5");
        five.setBounds(125, 250, 70, 70);
        five.setBackground(new Color(68,114,148));
        five.setForeground(Color.white);
        five.setFont(new Font("SansSerif", Font.PLAIN, 40));
        five.setFocusable(false);

        six.setText("6");
        six.setBounds(225, 250, 70, 70);
        six.setBackground(new Color(68,114,148));
        six.setForeground(Color.white);
        six.setFont(new Font("SansSerif", Font.PLAIN, 40));
        six.setFocusable(false);

        seven.setText("7");
        seven.setBounds(325, 250, 70, 70);
        seven.setBackground(new Color(68,114,148));
        seven.setForeground(Color.white);
        seven.setFont(new Font("SansSerif", Font.PLAIN, 40));
        seven.setFocusable(false);

        eight.setText("8");
        eight.setBounds(25, 150, 70, 70);
        eight.setBackground(new Color(68,114,148));
        eight.setForeground(Color.white);
        eight.setFont(new Font("SansSerif", Font.PLAIN, 40));
        eight.setFocusable(false);
        
        nine.setText("9");
        nine.setBounds(125, 150, 70, 70);
        nine.setBackground(new Color(68,114,148));
        nine.setForeground(Color.white);
        nine.setFont(new Font("SansSerif", Font.PLAIN, 40));
        nine.setFocusable(false);

        plus.setText("+");
        plus.setBounds(425, 450, 70, 70);
        plus.setBackground(Color.white);
        plus.setForeground(new Color(21, 52, 80));
        plus.setFont(new Font("SansSerif", Font.PLAIN, 40));
        plus.setFocusable(false); disable(plus);
        
        equals.setText("=");
        equals.setBounds(25, 450, 275, 70);
        equals.setBackground(new Color(143,188,219));
        equals.setForeground(Color.white);
        equals.setFont(new Font("SansSerif", Font.PLAIN, 40));
        equals.setFocusable(false); disable(equals);

        clearAll.setText("CA");
        clearAll.setBounds(225, 150, 175, 70);
        clearAll.setBackground(new Color(143,188,219));
        clearAll.setForeground(Color.white);
        clearAll.setFont(new Font("SansSerif", Font.PLAIN, 40));
        clearAll.setFocusable(false); disable(clearAll);

        minus.setText("-");
        minus.setBounds(425, 350, 70, 70);
        minus.setBackground(Color.white);
        minus.setForeground(new Color(21, 52, 80));
        minus.setFont(new Font("SansSerif", Font.PLAIN, 40));
        minus.setFocusable(false); hide(minus); disable(minus);

        times.setText("*");
        times.setBounds(425, 250, 70, 70);
        times.setBackground(Color.white);
        times.setForeground(new Color(21, 52, 80));
        times.setFont(new Font("SansSerif", Font.PLAIN, 40));
        times.setFocusable(false); disable(times);
        
        divide.setText("/");
        divide.setBounds(425, 150, 70, 70);
        divide.setBackground(Color.white);
        divide.setForeground(new Color(21, 52, 80));
        divide.setFont(new Font("SansSerif", Font.PLAIN, 40));
        divide.setFocusable(false); disable(divide);
       
        point.setText(".");
        point.setBounds(325, 450, 70, 70);
        point.setBackground(new Color(68,114,148));
        point.setForeground(Color.white);
        point.setFont(new Font("SansSerif", Font.PLAIN, 40));
        point.setFocusable(false);
        
        negative.setText("( - )");
        negative.setBounds(425, 350, 70, 70);
        negative.setBackground(Color.white);
        negative.setForeground(new Color(21, 52, 80));
        negative.setFont(new Font("SansSerif", Font.PLAIN, 20));
        negative.setFocusable(false);
    }

    public void buttonAction() {
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nzero); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + none); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + ntwo); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nthree); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nfour); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nfive); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nsix); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nseven); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + neight); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                nprevious = output.getText();
                output.setText(nprevious + nnine); outputNull(nprevious);
                disEn(plusState, minusState, timesState, divideState);
            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                pointState = true;
                nprevious = output.getText();
                output.setText(nprevious + npoint);
                if (pointState == true) {
                    disable(point);
                }
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                firstnum = output.getText();
                plusState = true;
                num1 = Double.parseDouble(firstnum);
                output.setText("");
                choices = 1;

                checkTrue(plusState);      
                enableNum();
                disableOper();
            }
        });
        
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                firstnum = output.getText();
                if (firstnum.length() != 0) {
                    minusState = true;
                    num1 = Double.parseDouble(firstnum);
                    output.setText("");
                }  
                choices = 2;
                checkTrue(minusState);
                enableNum();
                disableOper();
            }
        });
        
        negative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (negativeState == false) {
                    nprevious = output.getText();                    
                    output.setText(nprevious + nnegative); 
                    negativeState = true;                   
                }               
                if (negativeState == true) {
                    hide(negative);
                    show(minus);
                }
            }
        });
        
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                timesState = true;
                firstnum = output.getText();
                num1 = Double.parseDouble(firstnum);
                output.setText("");
                choices = 3;
                checkTrue(timesState);
                enableNum();
                disableOper();
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                divideState = true;
                firstnum = output.getText();
                num1 = Double.parseDouble(firstnum);
                output.setText("");
                choices = 4;
                checkTrue(divideState);
                enableNum();;
                disableOper();
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operation op = new Operation();
                secnum = output.getText();
                if (secnum.length() > 0) {
                    num2 = Double.parseDouble(secnum);
                    ans = op.choice(choices, num1, num2);
                }           
                String answer = Double.toString(ans);
                if (answer.length() >= 10) {
                    ans = (double) (Math.round(ans*1000.0)/1000.0);
                }
                answer = Double.toString(ans);
                output.setText(answer);
                enableAll();
                
                disableNum();
                
                minusState = false;
                plusState = false;
                divideState = false;
                timesState = false;
            }
        });

        clearAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                output.setText("");
                ans = 0.0;
                
                enable(point);
                enable(zero);
                enable(one);
                enable(two);
                enable(three);
                enable(four);
                enable(five);
                enable(six);
                enable(seven);
                enable(eight);
                enable(nine);
                
                hide(minus);
                show(negative);
                
                plusState = false;
                minusState = false;
                divideState = false;
                timesState = false;
                negativeState = false;
                
                disableOper();
            }
        });
    }
    
    public void disable(JButton btn) {
        btn.setEnabled(false);
    }

    public void enable(JButton btn) {
        btn.setEnabled(true);
    }

    public void checkTrue(boolean tf) {
        if (tf == true) {
            disable(plus);
            disable(minus);
            disable(times);
            disable(divide);
        } else {
            enableAll();
        }
    }
    
    public double checkNull(String fnum, JTextField op, double num1, boolean state) {
        if (fnum.length() > 0) {
            state = true;
            num1 = Double.parseDouble(fnum);
            op.setText("");
        }
        return num1;
    }
    
    public void enableAll() {
        enable(plus);
        enable(minus);
        enable(times);
        enable(divide);
    }
    
    public void show(JButton btn) {
        btn.setVisible(true);
    }
    
    public void hide(JButton btn) {
        btn.setVisible(false);
    }
    
    public void outputNull(String txt) {
        if (txt != "" || txt != null) {
            hide(negative);
            show(minus);
            enable(clearAll);           
        } 
            
    }
    
    public void ifFalse(boolean tf, JButton btn) {
        if (tf == false) {
            enable(btn);
        }    
    }
    
    public void allFalse() {
        ifFalse(plusState, plus);
        ifFalse(minusState, minus);
        ifFalse(timesState, times);
        ifFalse(divideState, divide);
    }
    
    public void enableNum() {
        enable(point);
        enable(zero);
        enable(one);
        enable(two);
        enable(three);
        enable(four);
        enable(five);
        enable(six);
        enable(seven);
        enable(eight);
        enable(nine);
        enable(equals);
    }
    
    public void disableNum() {
        disable(point);
        disable(zero);
        disable(one);
        disable(two);
        disable(three);
        disable(four);
        disable(five);
        disable(six);
        disable(seven);
        disable(eight);
        disable(nine);
        disable(equals);
    }
    
    public void disableOper() {
        disable(plus);
        disable(minus);
        disable(divide);
        disable(times);
    }
    
    public void disEn(boolean tf1, boolean tf2, boolean tf3, boolean tf4) {
        if (tf1 == true || tf2 == true || tf3 == true || tf4 == true) {
                    disableOper();
                } else {
                    enableAll();
                }
    }
        
}
