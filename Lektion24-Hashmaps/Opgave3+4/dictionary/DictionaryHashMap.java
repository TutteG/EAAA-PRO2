package dictionary;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	private Map<K, V>[] tabel;
	private int N = 10;
	private int size = 0;

	/**
	 * HashingMap constructor comment.
	 */
	public DictionaryHashMap() {
		tabel = new HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new HashMap<K, V>();
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		Map<K, V> map = tabel[i];
		return map.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel[i]).isEmpty();
			i++;
		}
		return empty;
	}

	@Override
	public V put(K key, V value) {
		int i = key.hashCode() % N;
		V oldValue = tabel[i].put(key, value);
		if (oldValue == null) {
			size++;
		}
		return oldValue;
	}

	@Override
	public V remove(K key) {
		int i = key.hashCode() % N;
		V oldValue = tabel[i].remove(key);
		if (oldValue != null) {
			size--;
		}
		return oldValue;
	}

	@Override
	public int size() {
		return size;
	}

	// Ja det er ikke en pæn to string...
	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < tabel.length; i++) {
			if (!tabel[i].isEmpty()) {
				string += tabel[i].toString() + "\n";
			}
		}
		return string;
	}
}
