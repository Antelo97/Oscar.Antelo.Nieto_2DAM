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
    public partial class FEjer4 : Form
    {
        public FEjer4()
        {
            InitializeComponent();
            WMPLib.WindowsMediaPlayer wmplayer = new WMPLib.WindowsMediaPlayer();
            wmplayer.URL = "";
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(comboBox1.SelectedIndex == 0)
            {
                lbSongs.Items.Clear();
                lbSongs.Items.Add("Mozart – Eine kleine Nachtmusik");
                lbSongs.Items.Add("Beethoven – Quinta sinfonía");
                lbSongs.Items.Add("Vivaldi – Las cuatro estaciones");
            }
            else if(comboBox1.SelectedIndex == 1)
            {
                lbSongs.Items.Clear();
                lbSongs.Items.Add("Bohemian rhapsody, de Queen");
                lbSongs.Items.Add("Staying alive', de Bee Gees");
                lbSongs.Items.Add("Respect, de Aretha Franklin");
            }
            else if(comboBox1.SelectedIndex == 2)
            {
                lbSongs.Items.Clear();
                lbSongs.Items.Add("The chainsmokers – Don't let me down");
                lbSongs.Items.Add("Alan Walker – Faded");
                lbSongs.Items.Add("Marshmello & Bastille – Happier");
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(lbSongs.Text == "Mozart – Eine kleine Nachtmusik")
            {
                lbDescription.Text = "La Serenata n.º 13 para cuerdas en sol mayor, más conocida como Eine kleine Nachtmusik, K. 525 \n" +
                    "es una de las composiciones más populares de Wolfgang Amadeus Mozart y de la música clásica en sí. \n" +
                    "Está fechada en Viena el 10 de agosto de 1787, coincidiendo con la composición de la ópera Don Giovanni.";

            }
            else if(lbSongs.Text == "Beethoven – Quinta sinfonía")
            {
                lbDescription.Text = "La Sinfonía n.º 5 en do menor, op. 67, de Ludwig van Beethoven fue compuesta entre 1804 y 1808. \n" +
                    "Esta sinfonía es una de las composiciones más populares e interpretadas de la música clásica.";
            }
            else if (lbSongs.Text == "Vivaldi – Las cuatro estaciones")
            {
                lbDescription.Text = "Las cuatro estaciones es un grupo de cuatro conciertos para violín y orquesta del compositor italiano Antonio Vivaldi.";
            }
            else if (lbSongs.Text == "Bohemian rhapsody, de Queen")
            {
                lbDescription.Text = "«Bohemian Rhapsody» es una canción y sencillo de la banda británica de rock Queen. Fue escrita por Freddie Mercury para el álbum de 1975 titulado A Night at the Opera. «Bohemian Rhapsody» presenta una estructura inusual, más similar a una rapsodia clásica que a la música popular.";
            }
            else if (lbSongs.Text == "Staying alive', de Bee Gees")
            {
                lbDescription.Text = "La Serenata n.º 13 para cuerdas en sol mayor, más conocida como Eine kleine Nachtmusik, K. 525 \n" +
                    "es una de las composiciones más populares de Wolfgang Amadeus Mozart y de la música clásica en sí. \n" +
                    "Está fechada en Viena el 10 de agosto de 1787, coincidiendo con la composición de la ópera Don Giovanni.";
            }
            else if (lbSongs.Text == "Respect, de Aretha Franklin")
            {
                lbDescription.Text = "La Serenata n.º 13 para cuerdas en sol mayor, más conocida como Eine kleine Nachtmusik, K. 525 \n" +
                    "es una de las composiciones más populares de Wolfgang Amadeus Mozart y de la música clásica en sí. \n" +
                    "Está fechada en Viena el 10 de agosto de 1787, coincidiendo con la composición de la ópera Don Giovanni.";
            }
            else if (lbSongs.Text == "The chainsmokers – Don't let me down")
            {
                lbDescription.Text = "La Serenata n.º 13 para cuerdas en sol mayor, más conocida como Eine kleine Nachtmusik, K. 525 \n" +
                    "es una de las composiciones más populares de Wolfgang Amadeus Mozart y de la música clásica en sí. \n" +
                    "Está fechada en Viena el 10 de agosto de 1787, coincidiendo con la composición de la ópera Don Giovanni.";
            }
            else if (lbSongs.Text == "Alan Walker – Faded")
            {
                lbDescription.Text = "La Serenata n.º 13 para cuerdas en sol mayor, más conocida como Eine kleine Nachtmusik, K. 525 \n" +
                    "es una de las composiciones más populares de Wolfgang Amadeus Mozart y de la música clásica en sí. \n" +
                    "Está fechada en Viena el 10 de agosto de 1787, coincidiendo con la composición de la ópera Don Giovanni.";
            }
            else if (lbSongs.Text == "Marshmello & Bastille – Happier")
            {
                lbDescription.Text = "La Serenata n.º 13 para cuerdas en sol mayor, más conocida como Eine kleine Nachtmusik, K. 525 \n" +
                    "es una de las composiciones más populares de Wolfgang Amadeus Mozart y de la música clásica en sí. \n" +
                    "Está fechada en Viena el 10 de agosto de 1787, coincidiendo con la composición de la ópera Don Giovanni.";
            }
        }

        private void lbDescription_Click(object sender, EventArgs e)
        {

        }
    }
}
