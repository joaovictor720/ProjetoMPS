package front;

class UserAdapter implements UserAdapterInterface {
  private SIGAABroker api;

  public UserAdapter(SIGAABroker api) {
    this.api = api;
  }

  public User getUser(){
    //método para converter as informações da API do SIGAA para ser utilizado no cadastro do usuário
  }
}