bdiv.setBounds(110, 170, 45, 40);
beq = new JButton("=");
beq.setBounds(150, 170, 45, 40);
bclr = new JButton("CLR");
bclr.setBounds(30, 210, 165, 40);
frame.add(t);
frame.add(b0);
frame.add(b1);
frame.add(b2);
frame.add(b3);
frame.add(b4);
frame.add(b5);
frame.add(b6);
frame.add(b7);
frame.add(b8);
frame.add(b9);
frame.add(bdot);
frame.add(badd);
frame.add(bsub);
frame.add(bmul);
frame.add(bdiv);
frame.add(beq);
frame.add(bclr);
b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bdot.addActionListener(this);
beq.addActionListener(this);
bclr.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bclr) {
            t.setText("");
        }
        if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == bdot) {
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            op = 1;
            t.setText("");
        }
        if (e.getSource() == bsub) {