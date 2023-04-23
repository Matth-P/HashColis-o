
public class EstruturaHashTable implements EstruturaDeDados{
    private Integer tabela[];
    private Integer porao[];

    public EstruturaHashTable() {
        //esse número pode ser alterado
        tabela = new Integer[1000];
        porao = new Integer[100];
    }


    @Override
    public boolean insert(int chave) {
        int hashNum = chave % 1000;
        if (tabela[hashNum] != null){
            insertPorao(chave);
            }
        else if (tabela[hashNum] == null){
            tabela[hashNum] = chave;
        }
        return true;
    }

    public boolean insertPorao(int chave){
        int i = porao.length - 1;
        while (i > -1){
            if (porao[i] == null){
                porao[i] = chave;
                break;
            }
            else i--;
        }
        return true;
    }

    @Override
    public boolean delete(int chave) {
        int hashNum = chave % 1000;
        if (tabela[hashNum] != null && tabela[hashNum] == chave){
                tabela[hashNum] = null;
                return true;
        }
        else if (deletePorao(chave) == true){
            return true;
        }
        else return false;
    }
    

    

    public boolean deletePorao(int chave){
        int i = porao.length - 1;
        while (i > -1){
            if (porao[i] != null && porao[i] == chave){
                porao[i] = null;
                return true;
            }
            else i--;
        }
        return false;
    }

    @Override
    public int search(int chave) {
        int hashNum = chave % 1000;
        if (tabela[hashNum] != null && tabela[hashNum] == chave){
                return chave;
        }
        else if (searchPorao(chave) == chave){
            return chave;
        }
        else return -1;
    }
    

    public int searchPorao(int chave){
        int i = porao.length - 1;
        while (i > -1){
            if (porao[i] != null && porao[i] == chave){
                return chave;
            }
            else i--;
        }
        return -1;
    } 
 }

