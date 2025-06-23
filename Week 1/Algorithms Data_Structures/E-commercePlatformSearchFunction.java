// Exercise 2: E-commerce Platform Search Function
class SearchProduct {
    int productId;
    String productName;
    String category;

    SearchProduct(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

class Search {
    static SearchProduct linearSearch(SearchProduct[] arr, String name) {
        for (SearchProduct p : arr) {
            if (p.productName.equals(name)) return p;
        }
        return null;
    }

    static SearchProduct binarySearch(SearchProduct[] arr, String name) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].productName.compareTo(name);
            if (cmp == 0) return arr[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}