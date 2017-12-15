public class PlayerQueue {

	// Number of players.
	int size;
	
	// References current player.
	Node head;
	
	// Stores players for easy reference.
	Player[] players;
    
	public PlayerQueue(Player[] _players) {
		size = _players.length;
		head = constructQueue(_players);
		players = _players;
	}
	
	private Node constuctQueue(Player[] players) {
		// Checks that there is more than one player.
		assert(players.length >= 1);
		
		// Creates a pointer to the front of the list.
		Node frnt = curr = new Node(players[0]), prev;
		
		// Iterates through players, making a linkedlist.
		for (int i= 1; i < size; i++) {
			 prev = curr;
			 curr = new Node(players[i]);
			 prev.tail = curr;
		}
		
		// Creates a pointer from end of list to front.
		curr.tail = frnt;
		
		
		// Returns front of linkedlist.
		return frnt;
	}
	
	public Player curr() {
		return head.player;
	}
	    
	public Player next() {
		head = head.tail;
		return head.player;
	}
	
	// In hindsight, I should've let Neel do this for practice.
	public void dequeue(Player player) {
		Node temp = head, next = head.tail;
		for (int i= 0; i < size; i++) {
		    if (player.equals(next.player)) {
				temp.tail = next.tail;
				size = size - 1; break;
			} else {
				temp = next; next = temp.tail;
			}
		}
	}
	
	class Node {
	
		public Player player;
		public Node tail;
		
		public Node(Player _player) {
			player = _player;
			tail = null;
		}
		
		public Node(Player _player, Node _tail) {
			player = _player;
			tail = _tail;
		}	
	}

}
