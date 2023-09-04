#Exemplo de um quicksort usando python
def quicksort(lista):
    if len(lista) < 2:
        return lista
    
    else:
        pivo = lista[0]
        esquerda = [x for x in lista[1:] if x < pivo]
        direita = [x for x in lista[1:] if x > pivo]

    return quicksort(esquerda) + [pivo] + quicksort(direita)

lista = [3,2,34,1,7,0,96,45]
quicksort(lista)
print(lista)

