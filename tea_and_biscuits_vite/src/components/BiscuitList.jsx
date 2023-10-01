const BiscuitList = ({ biscuits }) => {
  const handleDelete = (itemId)=> {
    fetch(`/api/biscuit/${itemId}`, {
      method: 'DELETE',
      header: {
        'Content-Type': 'application/json',
      }
    })
    .then(response => {
      if(response.ok) {

      } else {

      }
    })
    .catch(error => {
      console.error('Error deleting item:', error);
    });
  };
  return (
    <div id="biscuit-list">
      <h2>All the biccys!</h2>
      <ul>
        {biscuits.map(biscuit => {
          return (
            <>
            <li key={biscuit.name}>{biscuit.name} by {biscuit.brand}</li>
            <button onClick={()=> handleDelete(biscuit.id)}>delete</button>
            </>
          )
        })}
      </ul>
    </div>
  )
  
}

export default BiscuitList