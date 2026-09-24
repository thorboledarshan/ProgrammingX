import javax.swing.*;


class GUIButtonX
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous PPA");
        JButton bobj =new JButton("OK");
        fobj.setSize(400,300);
        bobj.setBounds(100,100,150,50);

        fobj.add(bobj);
        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //listener

    }
}