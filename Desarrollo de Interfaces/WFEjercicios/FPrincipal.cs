using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WMPLib;

namespace WFEjercicios
{
    public partial class FPrincipal : Form
    {
        public FPrincipal()
        {
            InitializeComponent();
        }

        private void FPrincipal_Load(object sender, EventArgs e)
        {
            this.BackColor = Color.LimeGreen;
            this.Text = "Ejercicios Windows Ford";
            /*this.agregarBoton();*/
            this.agregarLabel();
            this.agregarBotonSalir();
        }

        private void agregarBoton()
        {
            Button btnDinamico = new Button();
            btnDinamico.Name = "btnDinámico";
            btnDinamico.Text = "Nuevo botón";
            btnDinamico.Location = new System.Drawing.Point(25, 25);
            btnDinamico.Size = new System.Drawing.Size(100, 25);
            this.Controls.Add(btnDinamico);
        }

        private void agregarLabel()
        {
            Label lblDinamico = new Label();
            lblDinamico.Name = "lblDinámico";
            lblDinamico.Text = "Ejercicios Wdinwos Form";
            lblDinamico.Location = new System.Drawing.Point(25, 25);
            lblDinamico.Size = new System.Drawing.Size(100, 25);
            this.panel1.Controls.Add(lblDinamico);
            
        }

        private void agregarBotonSalir()
        {
            Button btnDinamicoSalir = new Button();
            btnDinamicoSalir.Name = "btnDinámico";
            btnDinamicoSalir.Text = "Salir";
            btnDinamicoSalir.Location = new System.Drawing.Point(25, 25);
            btnDinamicoSalir.Size = new System.Drawing.Size(100, 25);
            
        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            FEjer1 ejercicio_01 = new FEjer1();
            ejercicio_01.ShowDialog();
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            FEjer2 ejercicio_02 = new FEjer2();
            ejercicio_02.ShowDialog();
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            FEjer3 ejercicio_03 = new FEjer3();
            ejercicio_03.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            FEjer4 ejercicio_04 = new FEjer4();
            ejercicio_04.ShowDialog();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            //lbTimer.Text = "Evento 1";
            //lbTimer.Text = "Evento 2";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            FEjer5 ejercicio_05 = new FEjer5();
            ejercicio_05.ShowDialog();
        }

        private void trackBar1_Scroll(object sender, EventArgs e)
        {

        }

        private void button6_Click(object sender, EventArgs e)
        {
            
        }

        private void button6_Click_1(object sender, EventArgs e)
        {
            FEjer6 ejercicio_06 = new FEjer6();
            ejercicio_06.ShowDialog();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            FEjer7 ejercicio_07 = new FEjer7();
            ejercicio_07.ShowDialog();
        }
    }
}
