#include "sorting.h"
#include <stdlib.h>
#include <stdio.h>

void mergeSort(int*S, int f, int l){
	if(f==l)	return;
	int m = (f+l)/2;
	mergeSort(S, f, m);
	mergeSort(S, m+1, l);
	merge(S, f, m, l);
}

void merge(int*S, int f, int m, int l){
	int* tmp = malloc(sizeof(int)*(l-f+1));
	int i=f, j=m+1, k=0;
	while(i<=m && j<=l)
		tmp[k++] = (S[i]<S[j]) ? S[i++] : S[j++];
	while(i<=m) tmp[k++]=S[i++];
	while(j<=l) tmp[k++]=S[j++];
	int y = 0;
	for(int x=f; x<=l; x++)	S[x] = tmp[y++];
	free(tmp);
}
