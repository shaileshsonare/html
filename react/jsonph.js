function JsonPH() {

    

    fetch(`https://jsonplaceholder.typicode.com/users`)
    .then(res => res.json())
    .then(result => {

        console.table(result)

    })

    return <div>
        I m from JSON Placeholder
    </div>

}