using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFEjercicios
{
    public partial class FEjer6 : Form
    {
        public FEjer6()
        {
            InitializeComponent();
        }

        private void trackBar1_Scroll(object sender, EventArgs e)
        {
            timer1.Enabled = true;
            progressBar1.Value = trackBar1.Value;
            label1.Text = trackBar1.Value.ToString();
            label2.Text = progressBar1.Value.ToString();  
        }

        private void progressBar1_Click(object sender, EventArgs e)
        {
           
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (progressBar1.Value == 0)
            {
                timer1.Enabled = false;
            }
            else {
                progressBar1.Value--;
                label2.Text = progressBar1.Value.ToString();
            }
        }
    }
}
