#include <iostream>

using namespace std;

class Aluno {
  private:
    string nome;
    int matricula;
  public:
    // Construtor padrão
    Aluno(){}
    // Construtor parametrizado
    Aluno(string nome, int matricula){
      this->nome = nome;
      this->matricula = matricula;
    }
    // Destrutor
    ~Aluno(){
      cout << this->nome << " morreu..." << endl;
    }
    void mostra(){
      cout << "Nome     : " << this->nome << endl;
      cout << "Matricula: " << this->matricula << endl;
    }
};

int main() {
  Aluno a1;
  Aluno a2("João", 12345);
  Aluno *a3 = new Aluno("Maria", 45678);

  a2.mostra();
  a3->mostra();
  delete a3;
  
  return 0;
}