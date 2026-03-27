/**
 * Compara las puntuaciones de dos tripletes (a y b).
 * Puntos: +1 a quien tenga el valor mayor en la misma posición.
 * Si son iguales, nadie recibe puntos.
 * Complejidad: O(n)
 */
vector<int> compareTriplets(vector<int> a, vector<int> b) {
    int counta = 0;
    int countb = 0;
    vector<int> res;

    // Usamos .size() para obtener la cantidad real de elementos
    for (int i = 0; i < a.size(); i++) {
        if (a[i] > b[i]) {
            counta += 1;
        } else if (a[i] < b[i]) {
            countb += 1;
        }
    }

    // Guardamos los resultados finales en el vector de retorno
    res.push_back(counta);
    res.push_back(countb);

    return res;
}
