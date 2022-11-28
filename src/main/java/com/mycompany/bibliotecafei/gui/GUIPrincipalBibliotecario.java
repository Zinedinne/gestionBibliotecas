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
        panelRenovarUsuario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelRegistrarUsuario = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelModificarUsuario = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelConsultarUsuarios = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        panelGestionPrestamos = new javax.swing.JPanel();
        panelPrestamoDomicilio = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelPrestamoSala = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        panelInterbibliotecario = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        panelRegistrarDevolucion = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panelGestionRecursos = new javax.swing.JPanel();
        panelRegistrarRecurso = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelSolicitarFolio = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        panelBuscarRecurso = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        panelIdentificarRecurso = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();

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

        panelRenovarUsuario.setBackground(new java.awt.Color(0, 81, 158));
        panelRenovarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRenovarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRenovarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRenovarUsuarioMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Renovar usuario");

        javax.swing.GroupLayout panelRenovarUsuarioLayout = new javax.swing.GroupLayout(panelRenovarUsuario);
        panelRenovarUsuario.setLayout(panelRenovarUsuarioLayout);
        panelRenovarUsuarioLayout.setHorizontalGroup(
            panelRenovarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRenovarUsuarioLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(49, 49, 49))
        );
        panelRenovarUsuarioLayout.setVerticalGroup(
            panelRenovarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRenovarUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(49, 49, 49))
        );
        panelRegistrarUsuarioLayout.setVerticalGroup(
            panelRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelModificarUsuario.setBackground(new java.awt.Color(0, 81, 158));
        panelModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelModificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelModificarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelModificarUsuarioMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Modificar Usuario");

        javax.swing.GroupLayout panelModificarUsuarioLayout = new javax.swing.GroupLayout(panelModificarUsuario);
        panelModificarUsuario.setLayout(panelModificarUsuarioLayout);
        panelModificarUsuarioLayout.setHorizontalGroup(
            panelModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarUsuarioLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(49, 49, 49))
        );
        panelModificarUsuarioLayout.setVerticalGroup(
            panelModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelConsultarUsuarios.setBackground(new java.awt.Color(0, 81, 158));
        panelConsultarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelConsultarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelConsultarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelConsultarUsuariosMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Consultar Usuarios");

        javax.swing.GroupLayout panelConsultarUsuariosLayout = new javax.swing.GroupLayout(panelConsultarUsuarios);
        panelConsultarUsuarios.setLayout(panelConsultarUsuariosLayout);
        panelConsultarUsuariosLayout.setHorizontalGroup(
            panelConsultarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(39, 39, 39))
        );
        panelConsultarUsuariosLayout.setVerticalGroup(
            panelConsultarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarUsuariosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGestionUsuariosLayout = new javax.swing.GroupLayout(panelGestionUsuarios);
        panelGestionUsuarios.setLayout(panelGestionUsuariosLayout);
        panelGestionUsuariosLayout.setHorizontalGroup(
            panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionUsuariosLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRenovarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRegistrarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConsultarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelGestionUsuariosLayout.setVerticalGroup(
            panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionUsuariosLayout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addGroup(panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRenovarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelConsultarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        panelContenedor.add(panelGestionUsuarios, "card3");

        panelGestionPrestamos.setBackground(new java.awt.Color(255, 255, 255));

        panelPrestamoDomicilio.setBackground(new java.awt.Color(0, 81, 158));
        panelPrestamoDomicilio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPrestamoDomicilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPrestamoDomicilioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPrestamoDomicilioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPrestamoDomicilioMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Préstamo a domicilio");

        javax.swing.GroupLayout panelPrestamoDomicilioLayout = new javax.swing.GroupLayout(panelPrestamoDomicilio);
        panelPrestamoDomicilio.setLayout(panelPrestamoDomicilioLayout);
        panelPrestamoDomicilioLayout.setHorizontalGroup(
            panelPrestamoDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrestamoDomicilioLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(16, 16, 16))
        );
        panelPrestamoDomicilioLayout.setVerticalGroup(
            panelPrestamoDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoDomicilioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelPrestamoSala.setBackground(new java.awt.Color(0, 81, 158));
        panelPrestamoSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPrestamoSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPrestamoSalaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPrestamoSalaMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Préstamo en sala");

        javax.swing.GroupLayout panelPrestamoSalaLayout = new javax.swing.GroupLayout(panelPrestamoSala);
        panelPrestamoSala.setLayout(panelPrestamoSalaLayout);
        panelPrestamoSalaLayout.setHorizontalGroup(
            panelPrestamoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrestamoSalaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(57, 57, 57))
        );
        panelPrestamoSalaLayout.setVerticalGroup(
            panelPrestamoSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoSalaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelInterbibliotecario.setBackground(new java.awt.Color(0, 81, 158));
        panelInterbibliotecario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInterbibliotecario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelInterbibliotecarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelInterbibliotecarioMouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Interbibliotecario");

        javax.swing.GroupLayout panelInterbibliotecarioLayout = new javax.swing.GroupLayout(panelInterbibliotecario);
        panelInterbibliotecario.setLayout(panelInterbibliotecarioLayout);
        panelInterbibliotecarioLayout.setHorizontalGroup(
            panelInterbibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInterbibliotecarioLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(50, 50, 50))
        );
        panelInterbibliotecarioLayout.setVerticalGroup(
            panelInterbibliotecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInterbibliotecarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarDevolucionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(15, 15, 15))
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
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPrestamoSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrestamoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistrarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInterbibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        panelGestionPrestamosLayout.setVerticalGroup(
            panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionPrestamosLayout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addGroup(panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrestamoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelInterbibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelGestionPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrestamoSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
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
        jLabel24.setText("Registrar recurso");

        javax.swing.GroupLayout panelRegistrarRecursoLayout = new javax.swing.GroupLayout(panelRegistrarRecurso);
        panelRegistrarRecurso.setLayout(panelRegistrarRecursoLayout);
        panelRegistrarRecursoLayout.setHorizontalGroup(
            panelRegistrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarRecursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(39, 39, 39))
        );
        panelRegistrarRecursoLayout.setVerticalGroup(
            panelRegistrarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarRecursoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelSolicitarFolio.setBackground(new java.awt.Color(0, 81, 158));
        panelSolicitarFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSolicitarFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSolicitarFolioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSolicitarFolioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSolicitarFolioMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Solicitar folio");

        javax.swing.GroupLayout panelSolicitarFolioLayout = new javax.swing.GroupLayout(panelSolicitarFolio);
        panelSolicitarFolio.setLayout(panelSolicitarFolioLayout);
        panelSolicitarFolioLayout.setHorizontalGroup(
            panelSolicitarFolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarFolioLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(78, 78, 78))
        );
        panelSolicitarFolioLayout.setVerticalGroup(
            panelSolicitarFolioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitarFolioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
        jLabel26.setText("Buscar recurso");

        javax.swing.GroupLayout panelBuscarRecursoLayout = new javax.swing.GroupLayout(panelBuscarRecurso);
        panelBuscarRecurso.setLayout(panelBuscarRecursoLayout);
        panelBuscarRecursoLayout.setHorizontalGroup(
            panelBuscarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarRecursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(61, 61, 61))
        );
        panelBuscarRecursoLayout.setVerticalGroup(
            panelBuscarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarRecursoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelIdentificarRecurso.setBackground(new java.awt.Color(0, 81, 158));
        panelIdentificarRecurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIdentificarRecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelIdentificarRecursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelIdentificarRecursoMouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Identificar recurso");

        javax.swing.GroupLayout panelIdentificarRecursoLayout = new javax.swing.GroupLayout(panelIdentificarRecurso);
        panelIdentificarRecurso.setLayout(panelIdentificarRecursoLayout);
        panelIdentificarRecursoLayout.setHorizontalGroup(
            panelIdentificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdentificarRecursoLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(25, 25, 25))
        );
        panelIdentificarRecursoLayout.setVerticalGroup(
            panelIdentificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificarRecursoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGestionRecursosLayout = new javax.swing.GroupLayout(panelGestionRecursos);
        panelGestionRecursos.setLayout(panelGestionRecursosLayout);
        panelGestionRecursosLayout.setHorizontalGroup(
            panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionRecursosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistrarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSolicitarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBuscarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIdentificarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        panelGestionRecursosLayout.setVerticalGroup(
            panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionRecursosLayout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addGroup(panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistrarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBuscarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelGestionRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSolicitarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIdentificarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
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

    private void panelModificarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificarUsuarioMouseEntered
        panelModificarUsuario.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelModificarUsuarioMouseEntered

    private void panelRenovarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRenovarUsuarioMouseEntered
        panelRenovarUsuario.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRenovarUsuarioMouseEntered

    private void panelConsultarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConsultarUsuariosMouseEntered
        panelConsultarUsuarios.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelConsultarUsuariosMouseEntered

    private void panelRegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarUsuarioMouseExited
        panelRegistrarUsuario.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarUsuarioMouseExited

    private void panelModificarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificarUsuarioMouseExited
        panelModificarUsuario.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelModificarUsuarioMouseExited

    private void panelRenovarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRenovarUsuarioMouseExited
        panelRenovarUsuario.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRenovarUsuarioMouseExited

    private void panelConsultarUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConsultarUsuariosMouseExited
        panelConsultarUsuarios.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelConsultarUsuariosMouseExited

    private void panelPrestamoDomicilioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoDomicilioMouseEntered
        panelPrestamoDomicilio.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelPrestamoDomicilioMouseEntered

    private void panelInterbibliotecarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInterbibliotecarioMouseEntered
        panelInterbibliotecario.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelInterbibliotecarioMouseEntered

    private void panelPrestamoSalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSalaMouseEntered
        panelPrestamoSala.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelPrestamoSalaMouseEntered

    private void panelRegistrarDevolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarDevolucionMouseEntered
        panelRegistrarDevolucion.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRegistrarDevolucionMouseEntered

    private void panelPrestamoDomicilioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoDomicilioMouseExited
        panelPrestamoDomicilio.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelPrestamoDomicilioMouseExited

    private void panelInterbibliotecarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInterbibliotecarioMouseExited
        panelInterbibliotecario.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelInterbibliotecarioMouseExited

    private void panelPrestamoSalaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSalaMouseExited
        panelPrestamoSala.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelPrestamoSalaMouseExited

    private void panelRegistrarDevolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarDevolucionMouseExited
        panelRegistrarDevolucion.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarDevolucionMouseExited

    private void panelRegistrarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarRecursoMouseEntered
        panelRegistrarRecurso.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelRegistrarRecursoMouseEntered

    private void panelBuscarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRecursoMouseEntered
        panelBuscarRecurso.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelBuscarRecursoMouseEntered

    private void panelSolicitarFolioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitarFolioMouseEntered
        panelSolicitarFolio.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelSolicitarFolioMouseEntered

    private void panelIdentificarRecursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIdentificarRecursoMouseEntered
        panelIdentificarRecurso.setBackground(new java.awt.Color(87, 145, 195));
    }//GEN-LAST:event_panelIdentificarRecursoMouseEntered

    private void panelRegistrarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarRecursoMouseExited
        panelRegistrarRecurso.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelRegistrarRecursoMouseExited

    private void panelBuscarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRecursoMouseExited
        panelBuscarRecurso.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelBuscarRecursoMouseExited

    private void panelSolicitarFolioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitarFolioMouseExited
        panelSolicitarFolio.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelSolicitarFolioMouseExited

    private void panelIdentificarRecursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIdentificarRecursoMouseExited
        panelIdentificarRecurso.setBackground(new java.awt.Color(0,81,158));
    }//GEN-LAST:event_panelIdentificarRecursoMouseExited

    private void panelRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarUsuarioMouseClicked
        mostrarGUIRegistrarUsuario();
    }//GEN-LAST:event_panelRegistrarUsuarioMouseClicked

    private void panelPrestamoDomicilioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoDomicilioMouseClicked
        mostrarGUIPrestamoDomicilio();
    }//GEN-LAST:event_panelPrestamoDomicilioMouseClicked

    private void panelRegistrarDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarDevolucionMouseClicked
        mostrarGUIRegistrarDevolucion();
    }//GEN-LAST:event_panelRegistrarDevolucionMouseClicked

    private void panelRegistrarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistrarRecursoMouseClicked
        mostrarGUIRegistrarRecurso();
    }//GEN-LAST:event_panelRegistrarRecursoMouseClicked

    private void panelBuscarRecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBuscarRecursoMouseClicked
        mostrarGUIBuscarRecurso();
    }//GEN-LAST:event_panelBuscarRecursoMouseClicked

    private void panelSolicitarFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitarFolioMouseClicked
        mostrarGUISolicitarFolio();
    }//GEN-LAST:event_panelSolicitarFolioMouseClicked
    
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel panelConsultarUsuarios;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelGestionPrestamos;
    private javax.swing.JPanel panelGestionPrestamos2;
    private javax.swing.JPanel panelGestionRecursos;
    private javax.swing.JPanel panelGestionRecursos2;
    private javax.swing.JPanel panelGestionUsuarios;
    private javax.swing.JPanel panelGestionUsuarios2;
    private javax.swing.JPanel panelIdentificarRecurso;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelInterbibliotecario;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelMenuPrincipal2;
    private javax.swing.JPanel panelModificarUsuario;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPrestamoDomicilio;
    private javax.swing.JPanel panelPrestamoSala;
    private javax.swing.JPanel panelRegistrarDevolucion;
    private javax.swing.JPanel panelRegistrarRecurso;
    private javax.swing.JPanel panelRegistrarUsuario;
    private javax.swing.JPanel panelRegistrarUsuario2;
    private javax.swing.JPanel panelRenovarUsuario;
    private javax.swing.JPanel panelSolicitarFolio;
    // End of variables declaration//GEN-END:variables
}
