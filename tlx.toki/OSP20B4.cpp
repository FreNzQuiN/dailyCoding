#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<long long> b(n + 1);
    for (int i = 1; i <= n; ++i) {
        cin >> b[i];
    }

    vector<long long> energy(n + 1, 0);

    for (int i = 1; i <= n; ++i) {
        if (i == 1) {
            energy[i] = pow(b[i] - b[i - 1], 2);
        } else if (i == 2) {
            long long biasa = pow(b[i] - b[i - 1], 2) + energy[i - 1];
            long long super = 3 * pow(b[i] - b[i - 2], 2);
            energy[i] = min(biasa, super);
        } else {
            long long biasa = pow(b[i] - b[i - 1], 2) + energy[i - 1];
            long long super = 3 * pow(b[i] - b[i - 2], 2) + energy[i - 2];
            long long balik = pow(b[i - 2] - b[i - 1], 2) + 3 * pow(b[i] - b[i - 2], 2) + energy[i - 1];
            energy[i] = min({biasa, super, balik});
        }
    }

    cout << energy[n] << endl;

    return 0;
}

