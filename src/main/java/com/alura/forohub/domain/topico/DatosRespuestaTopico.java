package com.alura.forohub.domain.topico;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        String usuario,
        String curso
) {

    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getUsuario(), topico.getCurso());
    }

}
