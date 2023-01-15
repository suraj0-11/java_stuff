a = Double.parseDouble(t.getText());
op = 2;
t.setText("");
}
if (e.getSource() == bmul) {
    a = Double.parseDouble(t.getText());
    op = 3;
    t.setText("");
}
if (e.getSource() == bdiv) {
    a = Double.parseDouble(t.getText());
    op = 4;
    t.setText("");
}
if (e.getSource() == beq) {
    b = Double.parseDouble(t.getText());
    switch (op) {
        case 1:
            res = a + b;
            break;
        case 2:
            res = a - b;
            break;
        case 3:
            res = a * b;
            break;
        case 4:
            res = a / b;
            break;
    }
    t.setText("" + res);
}
}
}
public class CalculatorP {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.Display();
    }
}