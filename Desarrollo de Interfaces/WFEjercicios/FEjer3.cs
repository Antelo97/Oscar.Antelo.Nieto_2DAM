using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WFEjercicios.Properties;

namespace WFEjercicios
{
    public partial class FEjer3 : Form
    {
        public FEjer3()
        {
            InitializeComponent();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton6_CheckedChanged(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton3_CheckedChanged_1(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton4_CheckedChanged_1(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton5_CheckedChanged_1(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void radioButton6_CheckedChanged_1(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {
            
        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {
            
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            
        }

        private void elegirCoche() {

            if (rbFerrari.Checked && rbBlack.Checked)
            {
                pictureBox1.Image = Resources.ferrariNegro;
            }
            else if (rbFerrari.Checked && rbRed.Checked)
            {
                pictureBox1.Image = Resources.ferrariRojo;
            }
            else if (rbFerrari.Checked && rbYellow.Checked)
            {
                pictureBox1.Image = Resources.ferrariAmarillo;
            }
            else if (rbBugatti.Checked && rbBlack.Checked)
            {
                pictureBox1.Image = Resources.bugattiNegro;
            }
            else if (rbBugatti.Checked && rbRed.Checked)
            {
                pictureBox1.Image = Resources.bugattiRojo;
            }
            else if (rbBugatti.Checked && rbYellow.Checked)
            {
                pictureBox1.Image = Resources.bugattiAmarillo;
            }
            else if (rbMaserati.Checked && rbBlack.Checked)
            {
                pictureBox1.Image = Resources.maseratiNegro;
            }
            else if (rbMaserati.Checked && rbRed.Checked)
            {
                pictureBox1.Image = Resources.maseratiRojo;
            }
            else if (rbMaserati.Checked && rbYellow.Checked)
            {
                pictureBox1.Image = Resources.maseratiAmarillo;
            }
            else
            {
                pictureBox1.Image = null;
            }
        }
    }
}
