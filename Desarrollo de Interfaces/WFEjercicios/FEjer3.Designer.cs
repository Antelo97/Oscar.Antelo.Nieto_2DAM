namespace WFEjercicios
{
    partial class FEjer3
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rbMaserati = new System.Windows.Forms.RadioButton();
            this.rbBugatti = new System.Windows.Forms.RadioButton();
            this.rbFerrari = new System.Windows.Forms.RadioButton();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.rbYellow = new System.Windows.Forms.RadioButton();
            this.rbRed = new System.Windows.Forms.RadioButton();
            this.rbBlack = new System.Windows.Forms.RadioButton();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.rbMaserati);
            this.groupBox1.Controls.Add(this.rbBugatti);
            this.groupBox1.Controls.Add(this.rbFerrari);
            this.groupBox1.Location = new System.Drawing.Point(133, 22);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(200, 168);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Elegir marca";
            this.groupBox1.Enter += new System.EventHandler(this.groupBox1_Enter);
            // 
            // rbMaserati
            // 
            this.rbMaserati.AutoSize = true;
            this.rbMaserati.Location = new System.Drawing.Point(42, 109);
            this.rbMaserati.Name = "rbMaserati";
            this.rbMaserati.Size = new System.Drawing.Size(80, 20);
            this.rbMaserati.TabIndex = 2;
            this.rbMaserati.TabStop = true;
            this.rbMaserati.Text = "Maserati";
            this.rbMaserati.UseVisualStyleBackColor = true;
            this.rbMaserati.CheckedChanged += new System.EventHandler(this.radioButton3_CheckedChanged_1);
            // 
            // rbBugatti
            // 
            this.rbBugatti.AutoSize = true;
            this.rbBugatti.Location = new System.Drawing.Point(42, 70);
            this.rbBugatti.Name = "rbBugatti";
            this.rbBugatti.Size = new System.Drawing.Size(69, 20);
            this.rbBugatti.TabIndex = 1;
            this.rbBugatti.TabStop = true;
            this.rbBugatti.Text = "Bugatti";
            this.rbBugatti.UseVisualStyleBackColor = true;
            this.rbBugatti.CheckedChanged += new System.EventHandler(this.radioButton2_CheckedChanged);
            // 
            // rbFerrari
            // 
            this.rbFerrari.AutoSize = true;
            this.rbFerrari.Location = new System.Drawing.Point(42, 33);
            this.rbFerrari.Name = "rbFerrari";
            this.rbFerrari.Size = new System.Drawing.Size(67, 20);
            this.rbFerrari.TabIndex = 0;
            this.rbFerrari.TabStop = true;
            this.rbFerrari.Text = "Ferrari";
            this.rbFerrari.UseVisualStyleBackColor = true;
            this.rbFerrari.CheckedChanged += new System.EventHandler(this.radioButton1_CheckedChanged);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.rbYellow);
            this.groupBox2.Controls.Add(this.rbRed);
            this.groupBox2.Controls.Add(this.rbBlack);
            this.groupBox2.Location = new System.Drawing.Point(447, 22);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(200, 168);
            this.groupBox2.TabIndex = 3;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Elegir color";
            this.groupBox2.Enter += new System.EventHandler(this.groupBox2_Enter);
            // 
            // rbYellow
            // 
            this.rbYellow.AutoSize = true;
            this.rbYellow.Location = new System.Drawing.Point(42, 109);
            this.rbYellow.Name = "rbYellow";
            this.rbYellow.Size = new System.Drawing.Size(77, 20);
            this.rbYellow.TabIndex = 2;
            this.rbYellow.TabStop = true;
            this.rbYellow.Text = "Amarillo";
            this.rbYellow.UseVisualStyleBackColor = true;
            this.rbYellow.CheckedChanged += new System.EventHandler(this.radioButton6_CheckedChanged_1);
            // 
            // rbRed
            // 
            this.rbRed.AutoSize = true;
            this.rbRed.Location = new System.Drawing.Point(42, 70);
            this.rbRed.Name = "rbRed";
            this.rbRed.Size = new System.Drawing.Size(57, 20);
            this.rbRed.TabIndex = 1;
            this.rbRed.TabStop = true;
            this.rbRed.Text = "Rojo";
            this.rbRed.UseVisualStyleBackColor = true;
            this.rbRed.CheckedChanged += new System.EventHandler(this.radioButton5_CheckedChanged_1);
            // 
            // rbBlack
            // 
            this.rbBlack.AutoSize = true;
            this.rbBlack.Location = new System.Drawing.Point(42, 33);
            this.rbBlack.Name = "rbBlack";
            this.rbBlack.Size = new System.Drawing.Size(66, 20);
            this.rbBlack.TabIndex = 0;
            this.rbBlack.TabStop = true;
            this.rbBlack.Text = "Negro";
            this.rbBlack.UseVisualStyleBackColor = true;
            this.rbBlack.CheckedChanged += new System.EventHandler(this.radioButton4_CheckedChanged_1);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::WFEjercicios.Properties.Resources.maseratiRojo;
            this.pictureBox1.Location = new System.Drawing.Point(24, 219);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(764, 319);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 4;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // FEjer3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 559);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "FEjer3";
            this.Text = "Form1";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton rbMaserati;
        private System.Windows.Forms.RadioButton rbBugatti;
        private System.Windows.Forms.RadioButton rbFerrari;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.RadioButton rbYellow;
        private System.Windows.Forms.RadioButton rbRed;
        private System.Windows.Forms.RadioButton rbBlack;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}