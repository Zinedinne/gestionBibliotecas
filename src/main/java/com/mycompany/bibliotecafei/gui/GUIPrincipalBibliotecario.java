package com.mycompany.bibliotecafei.gui;

import com.mycompany.bibliotecafei.modelo.DataBaseConnection;
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
        activarMenuPrincipal();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBackground = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        panelGestionUsuarios2 = new javax.swing.JPanel();
        labelGestionUsuarios = new javax.swing.JLabel();
        panelGestionPrestamos2 = new javax.swing.JPanel();
        labelGestionPrestamos = new javax.swing.JLabel();
        panelGestionRecursos2 = new javax.swing.JPanel();
        labelGestionRecursos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelMenuPrincipal2 = new javax.swing.JPanel();
        labelMenuPrincipal = new javax.swing.JLabel();
        panelRegistrarUsuario2 = new javax.swing.JPanel();
        panelInformacion = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelFotoUsuario = new javax.swing.JLabel();
        labelNombreUsuario = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        panelMenuPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelGestionUsuarios = new javax.swing.JPanel();
        panelRegistrarUsuario = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelGestionPrestamos = new javax.swing.JPanel();
        panelRegistrarPrestamo = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelRegistrarDevolucion = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panelGestionRecursos = new javax.swing.JPanel();
        panelRegistrarRecurso = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelBuscarRecurso = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

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

        panelGestionUsuarios2.setBackground(new java.awt.Color(0, 81, 158));
        panelGestionUsuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelGestionUsuarios2Layout = new javax.swing.GroupLayout(panelGestionUsuarios2);
        panelGestionUsuarios2.setLayout(panelGestionUsuarios2Layout);
        panelGestionUsuarios2Layout.setHorizontalGroup(
            panelGestionUsuarios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelGestionUsuarios2Layout.setVerticalGroup(
            panelGestionUsuarios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelGestionUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 20, 50));

        labelGestionUsuarios.setBackground(new java.awt.Color(0, 81, 158));
        labelGestionUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGestionUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        labelGestionUsuarios.setText("    Gestión de usuarios");
        labelGestionUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelGestionUsuarios.setOpaque(true);
        labelGestionUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGestionUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelGestionUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelGestionUsuariosMouseExited(evt);
            }
        });
        panelOpciones.add(labelGestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 50));

        panelGestionPrestamos2.setBackground(new java.awt.Color(0, 81, 158));
        panelGestionPrestamos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelGestionPrestamos2Layout = new javax.swing.GroupLayout(panelGestionPrestamos2);
        panelGestionPrestamos2.setLayout(panelGestionPrestamos2Layout);
        panelGestionPrestamos2Layout.setHorizontalGroup(
            panelGestionPrestamos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelGestionPrestamos2Layout.setVerticalGroup(
            panelGestionPrestamos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelGestionPrestamos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 50));

        labelGestionPrestamos.setBackground(new java.awt.Color(0, 81, 158));
        labelGestionPrestamos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGestionPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        labelGestionPrestamos.setText("    Gestión de préstamos");
        labelGestionPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelGestionPrestamos.setOpaque(true);
        labelGestionPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGestionPrestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelGestionPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelGestionPrestamosMouseExited(evt);
            }
        });
        panelOpciones.add(labelGestionPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 50));

        panelGestionRecursos2.setBackground(new java.awt.Color(0, 81, 158));
        panelGestionRecursos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelGestionRecursos2Layout = new javax.swing.GroupLayout(panelGestionRecursos2);
        panelGestionRecursos2.setLayout(panelGestionRecursos2Layout);
        panelGestionRecursos2Layout.setHorizontalGroup(
            panelGestionRecursos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelGestionRecursos2Layout.setVerticalGroup(
            panelGestionRecursos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelGestionRecursos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 50));

        labelGestionRecursos.setBackground(new java.awt.Color(0, 81, 158));
        labelGestionRecursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGestionRecursos.setForeground(new java.awt.Color(255, 255, 255));
        labelGestionRecursos.setText("    Gestión de recursos");
        labelGestionRecursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelGestionRecursos.setOpaque(true);
        labelGestionRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGestionRecursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelGestionRecursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelGestionRecursosMouseExited(evt);
            }
        });
        panelOpciones.add(labelGestionRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 50));

        jLabel11.setBackground(new java.awt.Color(0, 81, 158));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("           Opciones");
        jLabel11.setOpaque(true);
        panelOpciones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        panelMenuPrincipal2.setBackground(new java.awt.Color(0, 81, 158));
        panelMenuPrincipal2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelMenuPrincipal2Layout = new javax.swing.GroupLayout(panelMenuPrincipal2);
        panelMenuPrincipal2.setLayout(panelMenuPrincipal2Layout);
        panelMenuPrincipal2Layout.setHorizontalGroup(
            panelMenuPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelMenuPrincipal2Layout.setVerticalGroup(
            panelMenuPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelMenuPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 20, 50));

        labelMenuPrincipal.setBackground(new java.awt.Color(0, 81, 158));
        labelMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        labelMenuPrincipal.setText("    Menú principal");
        labelMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuPrincipal.setOpaque(true);
        labelMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMenuPrincipalMouseExited(evt);
            }
        });
        panelOpciones.add(labelMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 50));

        panelRegistrarUsuario2.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarUsuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRegistrarUsuario2Layout = new javax.swing.GroupLayout(panelRegistrarUsuario2);
        panelRegistrarUsuario2.setLayout(panelRegistrarUsuario2Layout);
        panelRegistrarUsuario2Layout.setHorizontalGroup(
            panelRegistrarUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRegistrarUsuario2Layout.setVerticalGroup(
            panelRegistrarUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelOpciones.add(panelRegistrarUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 20, 50));

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
                .addContainerGap(419, Short.MAX_VALUE))
        );

        panelContenedor.add(panelMenuPrincipal, "card2");

        panelGestionUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        panelRegistrarUsuario.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistrarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRegistrarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRegistrarUsuarioMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Registrar Usuario");

        javax.swing.GroupLayout panelRegistrarUsuarioLayout = new javax.swing.GroupLayout(panelRegistrarUsuario);
        panelRegistrarUsuario.setLayout(panelRegistrarUsuarioLayout);
        panelRegistrarUsuarioLayout.setHorizontalGroup(
            panelRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarUsuarioLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel17)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        panelRegistrarUsuarioLayout.setVerticalGroup(
            panelRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout panelGestionUsuariosLayout = new javax.swing.GroupLayout(panelGestionUsuarios);
        panelGestionUsuarios.setLayout(panelGestionUsuariosLayout);
        panelGestionUsuariosLayout.setHorizontalGroup(
            panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionUsuariosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panelRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelGestionUsuariosLayout.setVerticalGroup(
            panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionUsuariosLayout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addComponent(panelRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        panelContenedor.add(panelGestionUsuarios, "card3");

        panelGestionPrestamos.setBackground(new java.awt.Color(255, 255, 255));

        panelRegistrarPrestamo.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistrarPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRegistrarPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRegistrarPrestamoMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Registrar préstamo");

        javax.swing.GroupLayout panelRegistrarPrestamoLayout = new javax.swing.GroupLayout(panelRegistrarPrestamo);
        panelRegistrarPrestamo.setLayout(panelRegistrarPrestamoLayout);
        panelRegistrarPrestamoLayout.setHorizontalGroup(
            panelRegistrarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarPrestamoLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel20)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        panelRegistrarPrestamoLayout.setVerticalGroup(
            panelRegistrarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarPrestamoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelRegistrarDevolucion.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistrarDevolucionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRegistrarDevolucionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRegistrarDevolucionMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Registrar devolución");

        javax.swing.GroupLayout panelRegistrarDevolucionLayout = new javax.swing.GroupLayout(panelRegistrarDevolucion);
        panelRegistrarDevolucion.setLayout(panelRegistrarDevolucionLayout);
        panelRegistrarDevolucionLayout.setHorizontalGroup(
            panelRegistrarDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarDevolucionLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistrarDevolucionLayout.setVerticalGroup(
            panelRegistrarDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarDevolucionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGestionPrestamosLayout = new javax.swing.GroupLayout(panelGestionPrestamos);
        panelGestionPrestamos.setLayout(panelGestionPrestamosLayout);
        panelGestionPrestamosLayout.setHorizontalGroup(
            panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionPrestamosLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistrarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelGestionPrestamosLayout.setVerticalGroup(
            panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionPrestamosLayout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(panelRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        panelContenedor.add(panelGestionPrestamos, "card4");

        panelGestionRecursos.setBackground(new java.awt.Color(255, 255, 255));

        panelRegistrarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        panelRegistrarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistrarRecursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRegistrarRecursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRegistrarRecursoMouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Registrar recurso documental");

        javax.swing.GroupLayout panelRegistrarRecursoLayout = new javax.swing.GroupLayout(panelRegistrarRecurso);
        panelRegistrarRecurso.setLayout(panelRegistrarRecursoLayout);
        panelRegistrarRecursoLayout.setHorizontalGroup(
            panelRegistrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarRecursoLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel24)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        panelRegistrarRecursoLayout.setVerticalGroup(
            panelRegistrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarRecursoLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        panelBuscarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        panelBuscarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBuscarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBuscarRecursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBuscarRecursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBuscarRecursoMouseExited(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Buscar recurso documental");

        javax.swing.GroupLayout panelBuscarRecursoLayout = new javax.swing.GroupLayout(panelBuscarRecurso);
        panelBuscarRecurso.setLayout(panelBuscarRecursoLayout);
        panelBuscarRecursoLayout.setHorizontalGroup(
            panelBuscarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarRecursoLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscarRecursoLayout.setVerticalGroup(
            panelBuscarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarRecursoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout panelGestionRecursosLayout = new javax.swing.GroupLayout(panelGestionRecursos);
        panelGestionRecursos.setLayout(panelGestionRecursosLayout);
        panelGestionRecursosLayout.setHorizontalGroup(
            panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionRecursosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBuscarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRegistrarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelGestionRecursosLayout.setVerticalGroup(
            panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionRecursosLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(panelRegistrarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBuscarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        panelContenedor.add(panelGestionRecursos, "card5");

        panelBackground.add(panelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 880, -1));

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

    private void labelGestionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionUsuariosMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionGestionPrestamos();
        desactivarOpcionGestionRecursos();
        activarOpcionGestionUsuarios();
    }//GEN-LAST:event_labelGestionUsuariosMouseClicked

    private void labelGestionPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionPrestamosMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionGestionRecursos();
        desactivarOpcionGestionUsuarios();
        activarOpcionGestionPrestamos();
    }//GEN-LAST:event_labelGestionPrestamosMouseClicked

    private void labelGestionRecursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionRecursosMouseClicked
        desactivarMenuPrincipal();
        desactivarOpcionGestionUsuarios();
        desactivarOpcionGestionPrestamos();
        activarOpcionGestionRecursos();
    }//GEN-LAST:event_labelGestionRecursosMouseClicked

    private void labelMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuPrincipalMouseClicked
        activarMenuPrincipal();
        desactivarOpcionGestionUsuarios();
        desactivarOpcionGestionPrestamos();
        desactivarOpcionGestionRecursos();
    }//GEN-LAST:event_labelMenuPrincipalMouseClicked

    private void labelGestionUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionUsuariosMouseEntered
        
    }//GEN-LAST:event_labelGestionUsuariosMouseEntered

    private void labelGestionPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionPrestamosMouseEntered
        
    }//GEN-LAST:event_labelGestionPrestamosMouseEntered

    private void labelGestionRecursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionRecursosMouseEntered
        
    }//GEN-LAST:event_labelGestionRecursosMouseEntered

    private void labelMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuPrincipalMouseEntered
        
    }//GEN-LAST:event_labelMenuPrincipalMouseEntered

    private void labelMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuPrincipalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelMenuPrincipalMouseExited

    private void labelGestionUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionUsuariosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelGestionUsuariosMouseExited

    private void labelGestionPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionPrestamosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelGestionPrestamosMouseExited

    private void labelGestionRecursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGestionRecursosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelGestionRecursosMouseExited

    private void panelRegistrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarUsuarioMouseEntered
        panelRegistrarUsuario.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRegistrarUsuarioMouseEntered

    private void panelRegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarUsuarioMouseExited
        panelRegistrarUsuario.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarUsuarioMouseExited

    private void panelRegistrarPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarPrestamoMouseEntered
        panelRegistrarPrestamo.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRegistrarPrestamoMouseEntered

    private void panelRegistrarDevolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarDevolucionMouseEntered
        panelRegistrarDevolucion.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRegistrarDevolucionMouseEntered

    private void panelRegistrarPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarPrestamoMouseExited
        panelRegistrarPrestamo.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarPrestamoMouseExited

    private void panelRegistrarDevolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarDevolucionMouseExited
        panelRegistrarDevolucion.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarDevolucionMouseExited

    private void panelRegistrarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarRecursoMouseEntered
        panelRegistrarRecurso.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRegistrarRecursoMouseEntered

    private void panelBuscarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRecursoMouseEntered
        panelBuscarRecurso.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelBuscarRecursoMouseEntered

    private void panelRegistrarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarRecursoMouseExited
        panelRegistrarRecurso.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarRecursoMouseExited

    private void panelBuscarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRecursoMouseExited
        panelBuscarRecurso.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelBuscarRecursoMouseExited

    private void panelRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarUsuarioMouseClicked
        mostrarGUIRegistrarUsuario();
    }//GEN-LAST:event_panelRegistrarUsuarioMouseClicked

    private void panelRegistrarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarPrestamoMouseClicked
        mostrarGUIPrestamoDomicilio();
    }//GEN-LAST:event_panelRegistrarPrestamoMouseClicked

    private void panelRegistrarDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarDevolucionMouseClicked
        mostrarGUIRegistrarDevolucion();
    }//GEN-LAST:event_panelRegistrarDevolucionMouseClicked

    private void panelRegistrarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarRecursoMouseClicked
        mostrarGUIRegistrarRecurso();
    }//GEN-LAST:event_panelRegistrarRecursoMouseClicked

    private void panelBuscarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRecursoMouseClicked
        mostrarGUIBuscarRecurso();
    }//GEN-LAST:event_panelBuscarRecursoMouseClicked
    
    private void activarMenuPrincipal(){
        panelMenuPrincipal.setVisible(true);
        labelMenuPrincipal.setBackground(new java.awt.Color(87, 145, 195));
        panelMenuPrincipal2.setVisible(true);
        panelMenuPrincipal2.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarMenuPrincipal(){
        panelMenuPrincipal.setVisible(false);
        panelMenuPrincipal2.setVisible(false);
        labelMenuPrincipal.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionGestionUsuarios(){
        panelGestionUsuarios.setVisible(true);
        labelGestionUsuarios.setBackground(new java.awt.Color(87, 145, 195));
        panelGestionUsuarios2.setVisible(true);
        panelGestionUsuarios2.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionGestionUsuarios(){
        panelGestionUsuarios.setVisible(false);
        panelGestionUsuarios2.setVisible(false);
        labelGestionUsuarios.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionGestionPrestamos(){
        panelGestionPrestamos.setVisible(true);
        labelGestionPrestamos.setBackground(new java.awt.Color(87, 145, 195));
        panelGestionPrestamos2.setVisible(true);
        panelGestionPrestamos2.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionGestionPrestamos(){
        panelGestionPrestamos.setVisible(false);
        panelGestionPrestamos2.setVisible(false);
        labelGestionPrestamos.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void activarOpcionGestionRecursos(){
        panelGestionRecursos.setVisible(true);
        labelGestionRecursos.setBackground(new java.awt.Color(87, 145, 195));
        panelGestionRecursos2.setVisible(true);
        panelGestionRecursos2.setBackground(new java.awt.Color(0, 153, 50));
    }
    
    private void desactivarOpcionGestionRecursos(){
        panelGestionRecursos.setVisible(false);
        panelGestionRecursos2.setVisible(false);
        labelGestionRecursos.setBackground(new java.awt.Color(0,81,158));
    }
    
    private void mostrarGUIBuscarRecurso(){
        GUIBuscarRecurso guiBuscarRecurso = new GUIBuscarRecurso();
        guiBuscarRecurso.setVisible(true);
    }
    
    private void mostrarGUIPrestamoDomicilio(){
        GUIPrestamoDomicilio guiPrestamoDomicilio = new GUIPrestamoDomicilio();
        guiPrestamoDomicilio.setVisible(true);
    }
    
    private void mostrarGUIRegistrarDevolucion(){
        GUIRegistrarDevolucion guiRegistrarDevolucion = new GUIRegistrarDevolucion();
        guiRegistrarDevolucion.setVisible(true);
    }
    
    private void mostrarGUIRegistrarRecurso(){
        GUIRegistrarRecurso guiRegistrarRecurso = new GUIRegistrarRecurso();
        guiRegistrarRecurso.setVisible(true);
    }
    
    private void mostrarGUIRegistrarUsuario(){
        GUIRegistrarUsuario guiRegistrarUsuario = new GUIRegistrarUsuario();
        guiRegistrarUsuario.setVisible(true);
    }
    
    private void mostrarGUISolicitarFolio(){
        GUISolicitarFolio guiSolicitarFolio = new GUISolicitarFolio();
        guiSolicitarFolio.setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFotoUsuario;
    private javax.swing.JLabel labelGestionPrestamos;
    private javax.swing.JLabel labelGestionRecursos;
    private javax.swing.JLabel labelGestionUsuarios;
    private javax.swing.JLabel labelMenuPrincipal;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBuscarRecurso;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelGestionPrestamos;
    private javax.swing.JPanel panelGestionPrestamos2;
    private javax.swing.JPanel panelGestionRecursos;
    private javax.swing.JPanel panelGestionRecursos2;
    private javax.swing.JPanel panelGestionUsuarios;
    private javax.swing.JPanel panelGestionUsuarios2;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelMenuPrincipal2;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelRegistrarDevolucion;
    private javax.swing.JPanel panelRegistrarPrestamo;
    private javax.swing.JPanel panelRegistrarRecurso;
    private javax.swing.JPanel panelRegistrarUsuario;
    private javax.swing.JPanel panelRegistrarUsuario2;
    // End of variables declaration//GEN-END:variables
}
