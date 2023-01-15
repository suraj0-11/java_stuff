

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
