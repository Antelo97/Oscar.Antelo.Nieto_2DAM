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
    public partial class FEjer7 : Form
    {
        BindingList<Alumno> listado = new BindingList<Alumno>();
        public FEjer7()
        {
            
            InitializeComponent();
        }

        private void FEjer7_Load(object sender, EventArgs e)
        {
            listado.Add(new Alumno
            {
                Nombre = "Pedro",
                Edad = 32,
                Alta = DateTime.Parse("5/12/2018"),
                Comedor = true,
                Turno = "Mañana"
            });

            dataGridView1.DataSource = listado;
        }

        private void button1_Click(object sender, EventArgs e)
        {

            Boolean edadBoolean;
            int edadInt;
            edadBoolean = int.TryParse(textBox2.Text, out edadInt);

            if(edadInt < 0 || !edadBoolean)
            {
                MessageBox.Show("Formato iválido");
            }
            else
            {
                listado.Add(new Alumno
                {
                    Nombre = textBox1.Text,
                    Edad = int.Parse(textBox2.Text),
                    Alta = DateTime.Parse(dateTimePicker1.Text),
                    Comedor = checkBox1.Checked,
                    Turno = comboBox1.Text,
                });
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            dataGridView1.Rows.RemoveAt(dataGridView1.CurrentCell.RowIndex);
        }

        private void lblNombre_Click(object sender, EventArgs e)
        {

        }
    }
}
