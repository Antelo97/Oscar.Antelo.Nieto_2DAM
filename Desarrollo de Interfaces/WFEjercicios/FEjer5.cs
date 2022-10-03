using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Timers;
using System.Windows.Forms;

namespace WFEjercicios
{
    public partial class FEjer5 : Form
    {
        public FEjer5()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (timer1.Enabled == true)
            {
                timer1.Enabled = false;
                textBox1.Text = label1.Text;
            }
            else
            {
                int number = Int32.Parse(textBox1.Text);
                label1.Text = number.ToString();
                textBox1.Visible = false;
                timer1.Enabled = true;
            }  
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            int contador = Int32.Parse(label1.Text);
            contador--;
            label1.Text = contador.ToString();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
