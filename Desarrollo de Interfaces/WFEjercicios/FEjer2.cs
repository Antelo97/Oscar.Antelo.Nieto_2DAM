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
    public partial class FEjer2 : Form
    {
        public FEjer2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(checkBox1.Checked)
            {
                checkBox1.Font = new Font(checkBox1.Font, FontStyle.Bold);
            }
            else
            {
                checkBox1.Font = new Font(checkBox1.Font, FontStyle.Regular);

            }

            if (checkBox2.Checked)
            {
                checkBox2.Font = new Font(checkBox2.Font, FontStyle.Bold);
            }
            else
            {
                checkBox2.Font = new Font(checkBox2.Font, FontStyle.Regular);

            }
        }
    }
}
