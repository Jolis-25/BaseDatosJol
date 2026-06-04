package com.example.basedatos.repositpries

import com.example.basedatos.dao.UsuarioDao
import com.example.basedatos.model.Usuario

class UsuarioRepositoryclass (private val usuarioDao: UsuarioDao) {
    suspend fun addUsuario(usuario: Usuario) = usuarioDao.insertarUsuario(usuario)
    suspend fun getAllUsuarios() = usuarioDao.obtenerUsuarios()
}
