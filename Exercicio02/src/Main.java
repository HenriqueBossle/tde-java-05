public class Main {
    public static void main(String[] args) {
         Usuario usuario1 = new Usuario("henrique", "henrique@gmail.com");
         UsuarioService usuarioService = new UsuarioService();
         usuarioService.cadastrarUsuario(usuario1);
         EmailService emailService = new EmailService();
         emailService.enviarEmail(usuario1);




    }
}
