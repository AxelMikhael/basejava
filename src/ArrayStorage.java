/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    /**
     * clear all array storage
     */
    void clear() {
        int arrayNumber = 0;
        while ((!(storage[arrayNumber] == null)) && (arrayNumber < storage.length)) {
            storage[arrayNumber] = null;
            arrayNumber++;
        }
    }

    /**
     * add new member to array Resume[] storage
     */
    void save(Resume r) {
        int arrayNumber = 0;
        while (!(storage[arrayNumber] == null)) {
            arrayNumber++;
        }

        storage[arrayNumber] = r;
    }

    /**
     * return member from array Resume[] storage by the specified unique number
     */
    Resume get(String uuid) {
        int arrayNumber = 0;
        while ((!(storage[arrayNumber] == null)) && (arrayNumber < storage.length)) {
            if (storage[arrayNumber].uuid == uuid) return storage[arrayNumber];
            arrayNumber++;
        }

        return null;
    }

    /**
     * delete member from array Resume[] storage by the specified unique number
     */
    void delete(String uuid) {
        int arrayNumber = 0;
        while ((!(storage[arrayNumber] == null)) && (arrayNumber < storage.length)) {
            if (storage[arrayNumber].uuid == uuid) break;
            arrayNumber++;
        }

        while ((!(storage[arrayNumber] == null)) && (arrayNumber < storage.length)) {
            storage[arrayNumber] = storage[arrayNumber + 1];
            arrayNumber++;
        }

        storage[arrayNumber + 1] = null;

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int arrayNumber = 0;
        while ((!(storage[arrayNumber] == null)) && (arrayNumber < storage.length)) {
            arrayNumber++;
        }

        int arraySize = arrayNumber;
        Resume[] newStorage = new Resume[arrayNumber];

        for (int i = 0; i < arraySize; i++) {
            newStorage[i] = storage[i];
        }

        return newStorage;

    }

    /**
     * return lenght of array, contains only Resumes in storage (without null)
     */
    int size() {

        int arrayLenght = 0;
        while ((!(storage[arrayLenght] == null)) && (arrayLenght < storage.length)) {
            arrayLenght++;
        }

        return arrayLenght;
    }
}
