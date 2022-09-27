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

        private void groupBox1_Enter(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {
            elegirCoche();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            
        }

        private void elegirCoche()
        {
            if (radioButton4.Checked && radioButton1.Checked)
            {
                pictureBox1.Image = Resources.ferrariNegro;
            }
            else if (radioButton1.Checked && radioButton5.Checked)
            {
                pictureBox1.Image = Resources.ferrariRojo;
            }
            else if (radioButton1.Checked && radioButton6.Checked)
            {
                pictureBox1.Image = Resources.ferrariAmarillo;
            }
            else if (radioButton2.Checked && radioButton4.Checked)
            {
                pictureBox1.Image = Resources.bugattiNegro;
            }
            else if (radioButton2.Checked && radioButton5.Checked)
            {
                pictureBox1.Image = Resources.bugattiRojo;
            }
            else if (radioButton2.Checked && radioButton6.Checked)
            {
                pictureBox1.Image = Resources.bugattiAmarillo;
            }
            else if (radioButton3.Checked && radioButton4.Checked)
            {
                pictureBox1.Image = Resources.maseratiNegro;
            }
            else if (radioButton3.Checked && radioButton5.Checked)
            {
                pictureBox1.Image = Resources.maseratiRojo;
            }
            else if (radioButton3.Checked && radioButton6.Checked)
            {
                pictureBox1.Image = Resources.ferrariAmarillo;
            }
            else
            {
                pictureBox1.Image = null;
            }
        }
    }
}
