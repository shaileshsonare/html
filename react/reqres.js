function ReqRes() {

    fetch(`https://reqres.in/api/users?page=1`)
    .then(res => res.json())
    .then(result => {

        console.table(result['data'])

    })

    return <>
        FROM REQRES
    </>

}