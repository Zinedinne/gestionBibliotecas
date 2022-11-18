package com.mycompany.bibliotecafei.gui;

import com.mycompany.bibliotecafei.modelo.DataBaseConnection;
import com.mycompany.bibliotecafei.modelo.dao.RecursoDocumentalDAO;
import com.mycompany.bibliotecafei.modelo.pojo.RecursoDocumental;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

public class GUIPrincipalBibliotecario extends javax.swing.JFrame {
    
    public GUIPrincipalBibliotecario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBackground = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        panelRegistrarUsuario = new javax.swing.JPanel();
        labelRegistrarUsuario = new javax.swing.JLabel();
        panelRegistrarPrestamo = new javax.swing.JPanel();
        labelRegistrarPrestamo = new javax.swing.JLabel();
        panelRegistrarRecurso = new javax.swing.JPanel();
        labelRegistrarRecurso = new javax.swing.JLabel();
        panelBuscarRecurso = new javax.swing.JPanel();
        labelBuscarRecurso = new javax.swing.JLabel();
        panelSolicitarFolio = new javax.swing.JPanel();
        labelSolicitarFolio = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelInformacion = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelFotoUsuario = new javax.swing.JLabel();
        labelNombreUsuario = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        panelMenuPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelFormularioRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelFormularioPrestamo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonPrestarRecurso = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panelFormularioRecurso = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfNombreRecurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfNombreAutor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        botonCancelarRecurso = new javax.swing.JPanel();
        labelCancelarPrestamo = new javax.swing.JLabel();
        botonRegistrarPrestamo = new javax.swing.JPanel();
        lbRegistrarRecurso = new javax.swing.JLabel();
        cbTipoRecurso = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbSeccion = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cbProcedencia = new javax.swing.JComboBox<>();
        panelBuscar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelFormularioFolio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUIPrincipal");
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBackground(new java.awt.Color(0, 81, 158));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistrarUsuario.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelRegistrarUsuarioLayout = new javax.swing.GroupLayout(panelRegistrarUsuario);
        panelRegistrarUsuario.setLayout(panelRegistrarUsuarioLayout);
        panelRegistrarUsuarioLayout.setHorizontalGroup(
            panelRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRegistrarUsuarioLayout.setVerticalGroup(
            panelRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 20, 50));

        labelRegistrarUsuario.setBackground(new java.awt.Color(0, 81, 158));
        labelRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrarUsuario.setText("    Registrar usuario");
        labelRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelRegistrarUsuario.setOpaque(true);
        labelRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistrarUsuarioMouseClicked(evt);
            }
        });
        panelOpciones.add(labelRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 50));

        panelRegistrarPrestamo.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelRegistrarPrestamoLayout = new javax.swing.GroupLayout(panelRegistrarPrestamo);
        panelRegistrarPrestamo.setLayout(panelRegistrarPrestamoLayout);
        panelRegistrarPrestamoLayout.setHorizontalGroup(
            panelRegistrarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRegistrarPrestamoLayout.setVerticalGroup(
            panelRegistrarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelRegistrarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 50));

        labelRegistrarPrestamo.setBackground(new java.awt.Color(0, 81, 158));
        labelRegistrarPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRegistrarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrarPrestamo.setText("    Registrar préstamo");
        labelRegistrarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelRegistrarPrestamo.setOpaque(true);
        labelRegistrarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistrarPrestamoMouseClicked(evt);
            }
        });
        panelOpciones.add(labelRegistrarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 50));

        panelRegistrarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelRegistrarRecursoLayout = new javax.swing.GroupLayout(panelRegistrarRecurso);
        panelRegistrarRecurso.setLayout(panelRegistrarRecursoLayout);
        panelRegistrarRecursoLayout.setHorizontalGroup(
            panelRegistrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRegistrarRecursoLayout.setVerticalGroup(
            panelRegistrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelRegistrarRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 50));

        labelRegistrarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        labelRegistrarRecurso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRegistrarRecurso.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrarRecurso.setText("    Registrar recurso");
        labelRegistrarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelRegistrarRecurso.setOpaque(true);
        labelRegistrarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistrarRecursoMouseClicked(evt);
            }
        });
        panelOpciones.add(labelRegistrarRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 50));

        panelBuscarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        panelBuscarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelBuscarRecursoLayout = new javax.swing.GroupLayout(panelBuscarRecurso);
        panelBuscarRecurso.setLayout(panelBuscarRecursoLayout);
        panelBuscarRecursoLayout.setHorizontalGroup(
            panelBuscarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelBuscarRecursoLayout.setVerticalGroup(
            panelBuscarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelBuscarRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 50));

        labelBuscarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        labelBuscarRecurso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelBuscarRecurso.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscarRecurso.setText("    Buscar recurso");
        labelBuscarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelBuscarRecurso.setOpaque(true);
        labelBuscarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBuscarRecursoMouseClicked(evt);
            }
        });
        panelOpciones.add(labelBuscarRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 50));

        panelSolicitarFolio.setBackground(new java.awt.Color(0, 81, 158));
        panelSolicitarFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelSolicitarFolioLayout = new javax.swing.GroupLayout(panelSolicitarFolio);
        panelSolicitarFolio.setLayout(panelSolicitarFolioLayout);
        panelSolicitarFolioLayout.setHorizontalGroup(
            panelSolicitarFolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelSolicitarFolioLayout.setVerticalGroup(
            panelSolicitarFolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelSolicitarFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 50));

        labelSolicitarFolio.setBackground(new java.awt.Color(0, 81, 158));
        labelSolicitarFolio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSolicitarFolio.setForeground(new java.awt.Color(255, 255, 255));
        labelSolicitarFolio.setText("    Solicitar folio");
        labelSolicitarFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelSolicitarFolio.setOpaque(true);
        labelSolicitarFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSolicitarFolioMouseClicked(evt);
            }
        });
        panelOpciones.add(labelSolicitarFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel11.setBackground(new java.awt.Color(0, 81, 158));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("           Opciones");
        jLabel11.setOpaque(true);
        panelOpciones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        panelBackground.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 640));

        panelInformacion.setBackground(new java.awt.Color(0, 81, 158));
        panelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText(" GAB UV");
        panelInformacion.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 0, 150, 70));
        panelInformacion.add(labelFotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 50, 50));
        panelInformacion.add(labelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 21, 360, 30));

        panelBackground.add(panelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        panelContenedor.setLayout(new java.awt.CardLayout());

        panelMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Menu principal");

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        panelContenedor.add(panelMenuPrincipal, "card2");

        panelFormularioRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Registrar usuario");

        javax.swing.GroupLayout panelFormularioRegistroLayout = new javax.swing.GroupLayout(panelFormularioRegistro);
        panelFormularioRegistro.setLayout(panelFormularioRegistroLayout);
        panelFormularioRegistroLayout.setHorizontalGroup(
            panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioRegistroLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel2)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        panelFormularioRegistroLayout.setVerticalGroup(
            panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioRegistroLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        panelContenedor.add(panelFormularioRegistro, "card3");

        panelFormularioPrestamo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("No. Personal/Matricula:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo", "Domicilio", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Datos del usuario:");

        jLabel8.setText("ID Recurso documental que se prestará:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Autor", "Estado", "Sección"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel9.setText("Datos del recurso documental:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Formulario para registro de préstamos a domicilio");

        botonPrestarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        botonPrestarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Prestar recurso");

        javax.swing.GroupLayout botonPrestarRecursoLayout = new javax.swing.GroupLayout(botonPrestarRecurso);
        botonPrestarRecurso.setLayout(botonPrestarRecursoLayout);
        botonPrestarRecursoLayout.setHorizontalGroup(
            botonPrestarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPrestarRecursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonPrestarRecursoLayout.setVerticalGroup(
            botonPrestarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botonCancelar.setBackground(new java.awt.Color(0, 81, 158));
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("    Cancelar");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout botonCancelarLayout = new javax.swing.GroupLayout(botonCancelar);
        botonCancelar.setLayout(botonCancelarLayout);
        botonCancelarLayout.setHorizontalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonCancelarLayout.setVerticalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFormularioPrestamoLayout = new javax.swing.GroupLayout(panelFormularioPrestamo);
        panelFormularioPrestamo.setLayout(panelFormularioPrestamoLayout);
        panelFormularioPrestamoLayout.setHorizontalGroup(
            panelFormularioPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioPrestamoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(panelFormularioPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(panelFormularioPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelFormularioPrestamoLayout.createSequentialGroup()
                            .addComponent(botonPrestarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioPrestamoLayout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jLabel10))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelFormularioPrestamoLayout.setVerticalGroup(
            panelFormularioPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioPrestamoLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelFormularioPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPrestarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        panelContenedor.add(panelFormularioPrestamo, "card4");

        panelFormularioRecurso.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Formulario para registro de recursos documentales");

        tfNombreRecurso.setToolTipText("Nombre del recurso documental");
        tfNombreRecurso.setName(""); // NOI18N
        tfNombreRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreRecursoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del recurso documental");

        jLabel15.setText("Autor");

        tfNombreAutor.setToolTipText("Autor");
        tfNombreAutor.setName(""); // NOI18N
        tfNombreAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreAutorActionPerformed(evt);
            }
        });

        jLabel16.setText("Descripción");

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        taDescripcion.setToolTipText("Descripción");
        jScrollPane3.setViewportView(taDescripcion);

        botonCancelarRecurso.setBackground(new java.awt.Color(0, 81, 158));

        labelCancelarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCancelarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        labelCancelarPrestamo.setText("       Cancelar");
        labelCancelarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout botonCancelarRecursoLayout = new javax.swing.GroupLayout(botonCancelarRecurso);
        botonCancelarRecurso.setLayout(botonCancelarRecursoLayout);
        botonCancelarRecursoLayout.setHorizontalGroup(
            botonCancelarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCancelarPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        botonCancelarRecursoLayout.setVerticalGroup(
            botonCancelarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCancelarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        botonRegistrarPrestamo.setBackground(new java.awt.Color(0, 81, 158));

        lbRegistrarRecurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbRegistrarRecurso.setForeground(new java.awt.Color(255, 255, 255));
        lbRegistrarRecurso.setText("Registrar recurso");
        lbRegistrarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbRegistrarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRegistrarRecursoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botonRegistrarPrestamoLayout = new javax.swing.GroupLayout(botonRegistrarPrestamo);
        botonRegistrarPrestamo.setLayout(botonRegistrarPrestamoLayout);
        botonRegistrarPrestamoLayout.setHorizontalGroup(
            botonRegistrarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRegistrarRecurso)
        );
        botonRegistrarPrestamoLayout.setVerticalGroup(
            botonRegistrarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRegistrarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        cbTipoRecurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economía", "Informática", "Estadística" }));

        jLabel20.setText("Tipo de recurso");

        jLabel21.setText("Sección");

        cbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "DVD", "Mapa", "Tesis", "TesisCD" }));

        jLabel22.setText("Procedencia");

        cbProcedencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economía", "Informática", "Estadística" }));

        javax.swing.GroupLayout panelFormularioRecursoLayout = new javax.swing.GroupLayout(panelFormularioRecurso);
        panelFormularioRecurso.setLayout(panelFormularioRecursoLayout);
        panelFormularioRecursoLayout.setHorizontalGroup(
            panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioRecursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(143, 143, 143))
            .addGroup(panelFormularioRecursoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCancelarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioRecursoLayout.createSequentialGroup()
                                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombreRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(142, 142, 142)
                                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(tfNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFormularioRecursoLayout.createSequentialGroup()
                                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(cbTipoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(115, 115, 115)
                                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(cbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(cbProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFormularioRecursoLayout.createSequentialGroup()
                                .addComponent(botonRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelFormularioRecursoLayout.setVerticalGroup(
            panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioRecursoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioRecursoLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioRecursoLayout.createSequentialGroup()
                        .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombreRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(panelFormularioRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioRecursoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonCancelarRecurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        panelContenedor.add(panelFormularioRecurso, "card5");

        panelBuscar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Buscar Recurso");

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel5)
                .addContainerGap(455, Short.MAX_VALUE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel5)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        panelContenedor.add(panelBuscar, "card6");

        panelFormularioFolio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Solicitar folio");

        javax.swing.GroupLayout panelFormularioFolioLayout = new javax.swing.GroupLayout(panelFormularioFolio);
        panelFormularioFolio.setLayout(panelFormularioFolioLayout);
        panelFormularioFolioLayout.setHorizontalGroup(
            panelFormularioFolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioFolioLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel6)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        panelFormularioFolioLayout.setVerticalGroup(
            panelFormularioFolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioFolioLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel6)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        panelContenedor.add(panelFormularioFolio, "card7");

        panelBackground.add(panelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 880, 643));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarUsuarioMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionRegistrarPrestamo();
        desactivarOpcionRegistrarRecurso();
        desactivarOpcionBuscarRecurso();
        desactivarOpcionSolicitarFolio();
        activarOpcionRegistrarUsuario();
    }//GEN-LAST:event_labelRegistrarUsuarioMouseClicked

    private void labelRegistrarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarPrestamoMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionRegistrarRecurso();
        desactivarOpcionBuscarRecurso();
        desactivarOpcionSolicitarFolio();
        desactivarOpcionRegistrarUsuario();
        activarOpcionRegistrarPrestamo();
    }//GEN-LAST:event_labelRegistrarPrestamoMouseClicked

    private void labelRegistrarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarRecursoMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionBuscarRecurso();
        desactivarOpcionSolicitarFolio();
        desactivarOpcionRegistrarUsuario();
        desactivarOpcionRegistrarPrestamo();
        activarOpcionRegistrarRecurso();
    }//GEN-LAST:event_labelRegistrarRecursoMouseClicked

    private void labelBuscarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarRecursoMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionSolicitarFolio();
        desactivarOpcionRegistrarUsuario();
        desactivarOpcionRegistrarPrestamo();
        desactivarOpcionRegistrarRecurso();
        activarOpcionBuscarRecurso();
    }//GEN-LAST:event_labelBuscarRecursoMouseClicked

    private void labelSolicitarFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSolicitarFolioMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionRegistrarUsuario();
        desactivarOpcionRegistrarPrestamo();
        desactivarOpcionRegistrarRecurso();
        desactivarOpcionBuscarRecurso();
        activarOpcionSolicitarFolio();
    }//GEN-LAST:event_labelSolicitarFolioMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tfNombreRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreRecursoActionPerformed

    private void tfNombreAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreAutorActionPerformed

    private void lbRegistrarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegistrarRecursoMouseClicked
        RecursoDocumental nuevoRecurso = null;
        try {
            RecursoDocumentalDAO.registroRecurso(nuevoRecurso);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_lbRegistrarRecursoMouseClicked
    
    private void activarMenuPrincipal(){
        panelMenuPrincipal.setVisible(true);
    }
    
    private void desactivarMenuPrincipal(){
        panelMenuPrincipal.setVisible(false);
    }
    
    private void activarOpcionRegistrarUsuario(){
        panelFormularioRegistro.setVisible(true);
        labelRegistrarUsuario.setBackground(new java.awt.Color(87, 145, 195));
        panelRegistrarUsuario.setVisible(true);
        panelRegistrarUsuario.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionRegistrarUsuario(){
        panelFormularioRegistro.setVisible(false);
        panelRegistrarUsuario.setVisible(false);
        labelRegistrarUsuario.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionRegistrarPrestamo(){
        panelFormularioPrestamo.setVisible(true);
        labelRegistrarPrestamo.setBackground(new java.awt.Color(87, 145, 195));
        panelRegistrarPrestamo.setVisible(true);
        panelRegistrarPrestamo.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionRegistrarPrestamo(){
        panelFormularioPrestamo.setVisible(false);
        panelRegistrarPrestamo.setVisible(false);
        labelRegistrarPrestamo.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionRegistrarRecurso(){
        panelFormularioRecurso.setVisible(true);
        labelRegistrarRecurso.setBackground(new java.awt.Color(87, 145, 195));
        panelRegistrarRecurso.setVisible(true);
        panelRegistrarRecurso.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionRegistrarRecurso(){
        panelFormularioRecurso.setVisible(false);
        panelRegistrarRecurso.setVisible(false);
        labelRegistrarRecurso.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionBuscarRecurso(){
        panelBuscar.setVisible(true);
        labelBuscarRecurso.setBackground(new java.awt.Color(87, 145, 195));
        panelBuscarRecurso.setVisible(true);
        panelBuscarRecurso.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionBuscarRecurso(){
        panelBuscar.setVisible(false);
        panelBuscarRecurso.setVisible(false);
        labelBuscarRecurso.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionSolicitarFolio(){
        panelFormularioFolio.setVisible(true);
        labelSolicitarFolio.setBackground(new java.awt.Color(87, 145, 195));
        panelSolicitarFolio.setVisible(true);
        panelSolicitarFolio.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionSolicitarFolio(){
        panelFormularioFolio.setVisible(false);
        panelSolicitarFolio.setVisible(false);
        labelSolicitarFolio.setBackground(new java.awt.Color(0,81,158));
    }
  
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipalBibliotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonCancelar;
    private javax.swing.JPanel botonCancelarRecurso;
    private javax.swing.JPanel botonCancelarRecurso1;
    private javax.swing.JPanel botonPrestarRecurso;
    private javax.swing.JPanel botonRegistrarPrestamo;
    private javax.swing.JComboBox<String> cbProcedencia;
    private javax.swing.JComboBox<String> cbSeccion;
    private javax.swing.JComboBox<String> cbTipoRecurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelBuscarRecurso;
    private javax.swing.JLabel labelCancelarPrestamo;
    private javax.swing.JLabel labelFotoUsuario;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JLabel labelRegistrarPrestamo;
    private javax.swing.JLabel labelRegistrarRecurso;
    private javax.swing.JLabel labelRegistrarUsuario;
    private javax.swing.JLabel labelSolicitarFolio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lbRegistrarRecurso;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelBuscarRecurso;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelFormularioFolio;
    private javax.swing.JPanel panelFormularioPrestamo;
    private javax.swing.JPanel panelFormularioRecurso;
    private javax.swing.JPanel panelFormularioRegistro;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelRegistrarPrestamo;
    private javax.swing.JPanel panelRegistrarRecurso;
    private javax.swing.JPanel panelRegistrarUsuario;
    private javax.swing.JPanel panelSolicitarFolio;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfNombreAutor;
    private javax.swing.JTextField tfNombreRecurso;
    // End of variables declaration//GEN-END:variables
}
