class Book { 
	String toString() {
	return "Book : ${catalogNumber}: ${title} by: ${author}"
	}
//Properties 
	def catalogNumber
	def title
	def author
}

class Library {
	def loanStock = [:]
	def name 
	def addBook(bk) {
		loanStock[bk.catalogNumber] = bk
	}

	def displayStock() {
		println "Library : ${name}"
		println '================='

		loanStock.each { catalogNumber, book -> println " ${book}"}
	}
//properties\
}

def lib = new Library(name : 'Dunning')
def bk1 = new Book(catalogNumber: '111', title : 'Groovy', author : 'Ken')
def bk2 = new Book(catalogNumber: '222', title : 'OOD', author : 'Ken')

lib.addBook(bk1)
lib.addBook(bk2)
//see stock 
lib.displayStock()